package org.elysium.tests.importuri;

import java.net.URI;
import java.util.List;

import org.elysium.LilyPondConstants;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class ImportUriResolverTest {

	@Test
	public void testAbsoluteWindows() {
		boolean isWindows=true;
		assertNotAbsolute(isWindows);
		if(LilyPondConstants.IS_WINDOWS) {
			//on non-windows systems new File("c:/...") is not recognized as absolute
			//hence this test is not platform independent
			checkIsAbsolute("c:/windowsfolder/file.ly", true, isWindows);
			checkIsAbsolute("c:/windows folder/fi le.ly", true, isWindows);
			checkIsAbsolute("c:\\windowsfolder\\file.ly", true, isWindows);
			checkIsAbsolute("c:\\windows folder\\fi le.ly", true, isWindows);
			checkIsAbsolute("c:\\\\windowsfolder\\\\file.ly", true, isWindows);
			checkIsAbsolute("c:\\\\windows folder\\\\fi le.ly", true, isWindows);
		}
	}

	@Test
	public void testAbsoluteOther() {
		boolean isWindows=false;
		assertNotAbsolute(isWindows);
		checkIsAbsolute("/file.ly", true, isWindows);
		checkIsAbsolute("/fi le.ly", true, isWindows);
		checkIsAbsolute("/unixfolder/file.ly", true, isWindows);
		checkIsAbsolute("/unix folder/fi le.ly", true, isWindows);
		checkIsAbsolute("file:/file.ly", true, isWindows);
		checkIsAbsolute("file:/fi le.ly", true, isWindows);
		checkIsAbsolute("file:/unixfolder/file.ly", true, isWindows);
		checkIsAbsolute("file:/unix folder/fi le.ly", true, isWindows);
		
	}

	private void assertNotAbsolute(boolean isWindows) {
		checkIsAbsolute(null, false, isWindows);
		checkIsAbsolute("", false, isWindows);
		checkIsAbsolute("file.ly", false, isWindows);
		checkIsAbsolute("fi le.ly", false, isWindows);
		checkIsAbsolute("folder/file.ly", false, isWindows);
		checkIsAbsolute("fol der/fi le.ly", false, isWindows);
		checkIsAbsolute("../file.ly", false, isWindows);
		checkIsAbsolute("../fi le.ly", false, isWindows);
		checkIsAbsolute("../otherFolder/file.ly", false, isWindows);
		checkIsAbsolute("../other Folder/fi le.ly", false, isWindows);
	}

	private void checkIsAbsolute(String includeString, boolean expectedAbsolute, boolean isWindows) {
		Assert.assertEquals(expectedAbsolute, LilyPondImportUriResolver.isAbsolute(includeString, isWindows));
	}

	//TODO test resolve with file names including white spaces
	@Test
	public void safeResolveWithFileBase() {
		List<String> bases= ImmutableList.of("file:/some/folder/","file:/some/folder/andfile.ly");
		boolean isWindows=true;
		for (String base : bases) {
			//general
			assertResolve(base, "file.ly", !isWindows, "file:/some/folder/file.ly");
			assertResolve(base, "file.ly", isWindows, "file:/some/folder/file.ly");
			assertResolve(base, "otherFolder/file.ly", !isWindows, "file:/some/folder/otherFolder/file.ly");
			assertResolve(base, "otherFolder/file.ly", isWindows, "file:/some/folder/otherFolder/file.ly");
			assertResolve(base, "../file.ly", !isWindows, "file:/some/file.ly");
			assertResolve(base, "../file.ly", isWindows, "file:/some/file.ly");

			//windows absolute
			assertResolve(base, "C:/windowsFolder/file.ly", isWindows, "file:/C:/windowsFolder/file.ly");

			//other absolute
			assertResolve(base, "file:/unixFolder/file.ly", !isWindows, "file:/unixFolder/file.ly");
			assertResolve(base, "/unixFolder/file.ly", !isWindows, "file:/unixFolder/file.ly");
		}
	}

	private void assertResolve(String base, String include, boolean isWindows, String expectedResolved) {
		URI baseURi = URI.create(base);
		URI resolved = LilyPondImportUriResolver.saferResolve(baseURi, include, isWindows);
		Assert.assertEquals(expectedResolved, resolved.toString());
	}
}