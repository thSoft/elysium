package org.elysium.ui.compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.util.process.OutputProcessor;

import org.eclipse.core.runtime.IProgressMonitor;

import com.google.common.base.Throwables;

public class CancellableProcessUtils {

	private CancellableProcessUtils() {
	}

	/**
	 * Runs a process synchronously described by the given process builder and
	 * processes the lines of its output with the given output processor.
	 */
	public static void runCancellableProcess(final ProcessBuilder processBuilder, final OutputProcessor outputProcessor, final IProgressMonitor monitor, final String processName) throws IOException, InterruptedException {
		final AtomicBoolean done=new AtomicBoolean(false);

		final Process process = processBuilder.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while(!done.get()){
					if(monitor.isCanceled()){
						process.destroy();
						return;
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		}, "Canceller for "+processName).start();

		try{
			new Thread(new Runnable() {
				@Override
				public void run() {
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
					String line;
					try {
						while ((line = reader.readLine()) != null) {
							if (outputProcessor != null) {
								outputProcessor.processOutput(line);
							}
						}
					} catch (IOException e) {
						Throwables.propagate(e);
					}
				}
				
			}, processName).start();
			process.waitFor();
		}catch(RuntimeException e){
			if(e.getCause() instanceof IOException){
				throw (IOException)e.getCause();
			}
			throw e;
		}finally{
			done.set(true);
		}
	}
}
