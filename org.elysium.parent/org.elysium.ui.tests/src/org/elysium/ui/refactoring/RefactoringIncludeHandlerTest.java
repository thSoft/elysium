package org.elysium.ui.refactoring;

import org.eclipse.core.runtime.Path;
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
		setSource("C:/ws/project/");
		currentImportUri = new LilyPondImportUri("otherDir/include.ly", "ignore", LilyPondImportUri.Type.relative);
		assertNewUri("otherDir/include2.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/otherDir/include2.ly");
		assertNewUri("otherDir2/include.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/otherDir2/include.ly");
		assertNewUri("other Dir2/inc lude.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/other Dir2/inc lude.ly");
		assertNewUri("../otherProject/include.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/otherProject/include.ly");
		assertNewUri("../otherProject/dir/include.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/otherProject/dir/include.ly");
		assertNewUri("../other Project/dir/inc lude.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/other Project/dir/inc lude.ly");
		assertNewUri("include2.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/include2.ly");
		assertNewUri("../include2.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/include2.ly");

		currentImportUri = new LilyPondImportUri("other Dir/inc lude.ly", "ignore", LilyPondImportUri.Type.relative);
		assertNewUri("otherDir/include2.ly", "C:/ws/project/other Dir/inc lude.ly", "C:/ws/project/otherDir/include2.ly");
	}

	@Test
	public void testRenameMoveFileRelative2(){
		setSource("C:/ws/project/dir");
		currentImportUri = new LilyPondImportUri("../otherDir/include.ly", "ignore", LilyPondImportUri.Type.relative);
		assertNewUri("../otherDir/include2.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/otherDir/include2.ly");
		assertNewUri("../otherDir2/include.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/otherDir2/include.ly");
		assertNewUri("../other Dir2/inc lude.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/other Dir2/inc lude.ly");
		assertNewUri("../../otherProject/include.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/otherProject/include.ly");
		assertNewUri("../../otherProject/dir/include.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/otherProject/dir/include.ly");
		assertNewUri("../../other Project/dir/inc lude.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/other Project/dir/inc lude.ly");

		assertNewUri("include2.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/project/dir/include2.ly");

		assertNewUri("../../include2.ly", "C:/ws/project/otherDir/include.ly", "C:/ws/include2.ly");
	}

	@Test
	public void testMoveIncludingFileRelative(){
		String includeLocation= "C:/ws/project/otherDir/include.ly";
		currentImportUri = new LilyPondImportUri("otherDir/include.ly", "ignore", LilyPondImportUri.Type.relative);
		setSource("C:/ws/project/","C:/ws/project/dir");
		assertNewUri("../otherDir/include.ly", includeLocation, includeLocation);

		setSource("C:/ws/project/","C:/ws/project/otherDir");
		assertNewUri("include.ly", includeLocation, includeLocation);

		setSource("C:/ws/project/","C:/ws/");
		assertNewUri("project/otherDir/include.ly", includeLocation, includeLocation);

		setSource("C:/ws/project/","C:/ws/other Project/dir");
		assertNewUri("../../project/otherDir/include.ly", includeLocation, includeLocation);

		currentImportUri = new LilyPondImportUri("../include.ly", "ignore", LilyPondImportUri.Type.relative);
		setSource("C:/ws/project/dir1/dir2","C:/ws/project/dir3");
		assertNewUri("../include.ly", "C:/ws/project/dir1/include.ly", "C:/ws/project/include.ly");
	}

//	
//	@Test
//	public void testSimplifyRelative1(){
//		setSource("C:/ws/project/");
//		currentImportUri = new LilyPondImportUri("../project/dir/include.ly", "ignore", LilyPondImportUri.Type.relative);
//		assertNewUri("dir/include2.ly", "C:/ws/project/dir/include.ly", "C:/ws/project/dir/include2.ly");
//	}

	@Test
	public void testRenameMoveFileFromAbsolute(){
		setSource("C:/ws/project/");
		currentImportUri = new LilyPondImportUri("C:/dir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		assertNewUri("C:/dir/include2.ly", "C:/dir/include.ly", "C:/dir/include2.ly");
		assertNewUri("C:/otherDir/include.ly", "C:/dir/include.ly", "C:/otherDir/include.ly");
		assertNewUri("C:/otherDir/dir/include.ly", "C:/dir/include.ly", "C:/otherDir/dir/include.ly");
		assertNewUri("C:/other Dir/dir/inc lude.ly", "C:/dir/include.ly", "C:/other Dir/dir/inc lude.ly");
	}

	@Test
	public void testMoveIncludingFileAbsolute(){
		String includeLocation= "ignoreAsNoChange";
		currentImportUri = new LilyPondImportUri("C:/ws/project/otherDir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		setSource("C:/ws/project/","C:/ws/project/dir");
		assertNewUri("C:/ws/project/otherDir/include.ly", includeLocation, includeLocation);

		setSource("C:/ws/project/","C:/ws/otherProject/dir1/dir2");
		assertNewUri("C:/ws/project/otherDir/include.ly", includeLocation, includeLocation);
	}

	@Test
	public void testMoveTargetAndIncludingFileAbsolut(){
		currentImportUri = new LilyPondImportUri("C:/ws/project/otherDir/include.ly", "ignore", LilyPondImportUri.Type.absolute);
		setSource("C:/ws/project/","C:/ws/project/dir");
		assertNewUri("include.ly", "doesNotMatter", "C:/ws/project/dir/include.ly");
		assertNewUri("tidum/include.ly", "doesNotMatter", "C:/ws/project/dir/tidum/include.ly");
		assertNewUri("../include.ly", "doesNotMatter", "C:/ws/project/include.ly");
	}

	@Test
	public void testSearchPath(){
		String includeLocation= "ignoreAsNoChange";
		currentImportUri = new LilyPondImportUri("include.ly", "ignore", LilyPondImportUri.Type.searchPath);
		setSource("C:/ws/project/","C:/ws/project/dir");
		assertNewUri("include.ly", includeLocation, includeLocation);

		setSource("C:/ws/project/dir1/dir2","C:/ws/project2/dir2");
		assertNewUri("include.ly", includeLocation, includeLocation);

		setSource("C:/ws/project/nochange");
		assertNewUri("include2.ly", "C:/ws/searchpath/include.ly", "C:/ws/searchpath/include2.ly");
		assertNewUri("inc lude.ly", "C:/ws/searchpath/include.ly", "C:/ws/searchpath/inc lude.ly");
		assertNewUri("folder/include.ly", "C:/ws/searchpath/include.ly", "C:/ws/searchpath/folder/include.ly");
		assertNewUri("fol der/inc lude.ly", "C:/ws/searchpath/include.ly", "C:/ws/searchpath/fol der/inc lude.ly");
		assertNewUri("../include.ly", "C:/ws/searchpath/include.ly", "C:/ws/include.ly");
	}

	private void setSource(String source){
		setSource(source,source);
	}

	private void setSource(String source, String source2) {
		sourceFileDir=source;
		sourceFileDestinationDir=source2;
	}
	private void assertNewUri(String expected, String refactoringTarget, String refactoringTargetDestinattion){
		//leave all paths unmodified
		LilyPondRefactoredImportUriCalculator handler = getHandler(sourceFileDir, sourceFileDestinationDir, refactoringTarget, refactoringTargetDestinattion, false);
		Assert.assertEquals(expected, handler.getNewImportUri(currentImportUri));

		//replace windows "C:" prefix in all paths by "/home" 
		handler = getHandler(sourceFileDir, sourceFileDestinationDir, refactoringTarget, refactoringTargetDestinattion, true);
		LilyPondImportUri importUri=new LilyPondImportUri(cToHome(currentImportUri.getOriginalUri()), cToHome(currentImportUri.getUri()), currentImportUri.getType());
		Assert.assertEquals(cToHome(expected), handler.getNewImportUri(importUri));
	}

	private LilyPondRefactoredImportUriCalculator getHandler(String sourceDir, String sourceDestinationDir, String target, String targetDestination, boolean cToHome){
		if(!cToHome) {
			return new LilyPondRefactoredImportUriCalculator(new Path(sourceDir), new Path(sourceDestinationDir), new Path(target), new Path(targetDestination));
		} else {
			Path sPath = new Path(cToHome(sourceDir));
			Path sDestPath = new Path(cToHome(sourceDestinationDir));
			Path tPath = new Path(cToHome(target));
			Path tDestPath = new Path(cToHome(targetDestination));
			return new LilyPondRefactoredImportUriCalculator(sPath, sDestPath, tPath, tDestPath);
		}
	}

	private String cToHome(String s) {
		if(s.startsWith("C:")) {
			return "/home"+s.substring(2);
		} else {
			return s;
		}
	}
}