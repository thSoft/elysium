package org.elysium.ui.compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.util.process.OutputProcessor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.elysium.ui.Activator;

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
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					String line;
					try {
						while ((line = reader.readLine()) != null) {
							doProcessLine(processName, outputProcessor, line);
						}
					} catch (IOException e) {
						Activator.logError("console output processing aborted", e);
					}
				}
				
			}, processName).start();
			process.waitFor();
		}finally{
			done.set(true);
		}
	}

	private static void doProcessLine(String processName, OutputProcessor outputProcessor, String line) {
		if(outputProcessor != null) {
			try {
				outputProcessor.processOutput(line);
			} catch (Exception e) {
				Activator.logError(String.format("error processing console output line '%s' for process %s", line, processName), e);
			}
		}
	}
}
