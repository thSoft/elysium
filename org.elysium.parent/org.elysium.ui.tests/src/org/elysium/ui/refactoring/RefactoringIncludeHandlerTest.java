package org.elysium.ui.refactoring;

import org.eclipse.core.runtime.Path;
import org.elysium.importuri.LilyPondImportUri;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RefactoringIncludeHandlerTest {

	LilyPondImportUri currentImportUri;
	String sourceFileDir;
	String sourceFileDestinationDir;

	@Before
	public void setup(){
		setSource(null);
	}

	@Test
	public void testRenameMoveFileRelative1(){
		setSource("project/");
		currentImportUri = new LilyPondImportUri("otherDir/include.ly", "ignore", LilyPondImportUri.Type.relative);
		assertNewUri("otherDir/include2.ly", "project/otherDir/include.ly", "project/otherDir/include2.ly");
		assertNewUri("otherDir2/include.ly", "project/otherDir/include.ly", "project/otherDir2/include.ly");
		assertNewUri("../otherProject/include.ly", "project/otherDir/include.ly", "otherProject/include.ly");
		assertNewUri("../otherProject/dir/include.ly", "project/otherDir/include.ly", "otherProject/dir/include.ly");
		assertNewUri("include2.ly", "project/otherDir/include.ly", "project/include2.ly");
		assertNewUri("../include2.ly", "project/otherDir/include.ly", "include2.ly");
	}

	@Test
	public void testRenameMoveFileRelative2(){
		setSource("project/dir");
		currentImportUri = new LilyPondImportUri("../otherDir/include.ly", "ignore", LilyPondImportUri.Type.relative);
		assertNewUri("../otherDir/include2.ly", "project/otherDir/include.ly", "project/otherDir/include2.ly");
		assertNewUri("../otherDir2/include.ly", "project/otherDir/include.ly", "project/otherDir2/include.ly");
		assertNewUri("../../otherProject/include.ly", "project/otherDir/include.ly", "otherProject/include.ly");
		assertNewUri("../../otherProject/dir/include.ly", "project/otherDir/include.ly", "otherProject/dir/include.ly");

		assertNewUri("include2.ly", "project/otherDir/include.ly", "project/dir/include2.ly");

		assertNewUri("../../include2.ly", "project/otherDir/include.ly", "include2.ly");
	}

	@Test
	public void testMoveIncludingFileRelative(){
		String includeLocation= "project/otherDir/include.ly";
		currentImportUri = new LilyPondImportUri("otherDir/include.ly", "ignore", LilyPondImportUri.Type.relative);
		setSource("project/","project/dir");
		assertNewUri("../otherDir/include.ly", includeLocation, includeLocation);

		setSource("project/","project/otherDir");
		assertNewUri("include.ly", includeLocation, includeLocation);

		setSource("project/","otherProject/dir");
		assertNewUri("../../project/otherDir/include.ly", includeLocation, includeLocation);

		currentImportUri = new LilyPondImportUri("../include.ly", "ignore", LilyPondImportUri.Type.relative);
		setSource("project/dir1/dir2","project/dir3");
		assertNewUri("../include.ly", "project/dir1/include.ly", "project/include.ly");
		
	}

	@Test
	public void testRenameMoveFileFromAbsolute(){
		setSource("project/");
		currentImportUri = new LilyPondImportUri("/dir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		assertNewUri("/dir/include2.ly", "dir/include.ly", "dir/include2.ly");
		assertNewUri("/otherDir/include.ly", "dir/include.ly", "otherDir/include.ly");
		assertNewUri("/otherDir/dir/include.ly", "dir/include.ly", "otherDir/dir/include.ly");

		currentImportUri = new LilyPondImportUri("C:/dir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		assertNewUri("C:/dir/include2.ly", "dir/include.ly", "dir/include2.ly");
		assertNewUri("C:/otherDir/include.ly", "dir/include.ly", "otherDir/include.ly");
		assertNewUri("C:/otherDir/dir/include.ly", "dir/include.ly", "otherDir/dir/include.ly");
	}

	@Test
	public void testMoveIncludingFileAbsolute(){
		String includeLocation= "ignoreAsNoChange";
		currentImportUri = new LilyPondImportUri("/project/otherDir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		setSource("project/","project/dir");
		assertNewUri("/project/otherDir/include.ly", includeLocation, includeLocation);

		setSource("project/","otherProject/dir1/dir2");
		assertNewUri("/project/otherDir/include.ly", includeLocation, includeLocation);
	}

	@Test
	public void testMoveTargetAndIncludingFileAbsolut(){
		currentImportUri = new LilyPondImportUri("/project/otherDir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		setSource("project/","project/dir");
		assertNewUri("include.ly", "doesNotMatter", "project/dir/include.ly");
		assertNewUri("tidum/include.ly", "doesNotMatter", "project/dir/tidum/include.ly");
		assertNewUri("../include.ly", "doesNotMatter", "project/include.ly");
	}

	@Test
	public void testSearchPath(){
		String includeLocation= "ignoreAsNoChange";
		currentImportUri = new LilyPondImportUri("include.ly", "ignore", LilyPondImportUri.Type.searchPath);
		setSource("project/","project/dir");
		assertNewUri("include.ly", includeLocation, includeLocation);
		setSource("project/dir1/dir2","project2/dir2");
		assertNewUri("include.ly", includeLocation, includeLocation);
	}

	private void setSource(String source){
		setSource(source,source);
	}

	private void setSource(String source, String source2) {
		sourceFileDir=source;
		sourceFileDestinationDir=source2;
	}
	private void assertNewUri(String expected, String refactoringTarget, String refactoringTargetDestinattion){
		LilyPondRefactoredImportUriCalculator handler = getHandler(sourceFileDir, sourceFileDestinationDir, refactoringTarget, refactoringTargetDestinattion);
		Assert.assertEquals(expected, handler.getNewImportUri(currentImportUri));
		handler = getHandler(sourceFileDir, sourceFileDestinationDir, "/"+refactoringTarget, "/"+refactoringTargetDestinattion);
		Assert.assertEquals(expected, handler.getNewImportUri(currentImportUri));
	}

	private LilyPondRefactoredImportUriCalculator getHandler(String sourceDir, String sourceDestinationDir, String target, String targetDestination){
		return new LilyPondRefactoredImportUriCalculator(new Path(sourceDir), new Path(sourceDestinationDir), new Path(target), new Path(targetDestination));
	}
}