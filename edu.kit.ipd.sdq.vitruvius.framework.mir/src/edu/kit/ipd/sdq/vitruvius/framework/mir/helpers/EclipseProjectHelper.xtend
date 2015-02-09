package edu.kit.ipd.sdq.vitruvius.framework.mir.helpers

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.xtext.generator.IFileSystemAccess

class EclipseProjectHelper {
	public final String SRC_GEN_FOLDER_NAME = "src-gen"
	
	private String projectName
	private IFileSystemAccess rootFSA
	private IFileSystemAccess srcgenFSA
	
	new(String projectName) {
		this.projectName = projectName
	}
	
	public def deleteProject() {
		val project = getProject()		

		if (project.exists)
			project.delete(true, null)
	}
	
	/**
	 * @see https://sdqweb.ipd.kit.edu/wiki/JDT_Tutorial:_Creating_Eclipse_Java_Projects_Programmatically
	 */
	public def createJavaProject() {
		val project = getProject()

		// add Java nature
		val description = project.getDescription();
		description.setNatureIds(#[ JavaCore.NATURE_ID ]);
		project.setDescription(description, null);
		
		// create Java project
		val javaProject = JavaCore.create(project);
		
		// set bin folder
		val binFolder = project.getFolder("bin");
		binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);
		
		// set JVM for the project
		val entries = newArrayList
		val vmInstall = JavaRuntime.getDefaultVMInstall();
		val libraryLocations = JavaRuntime.getLibraryLocations(vmInstall);
		for (element : libraryLocations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		
		// add libs to project class path
		javaProject.setRawClasspath(entries.toArray(newArrayOfSize(entries.size())), null);
		
		// add src and src-gen folder
		val sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		val sourceRoot = javaProject.getPackageFragmentRoot(sourceFolder);
		
//		val sourceGenFolder = project.getFolder("src-gen");
//		sourceGenFolder.create(false, true, null);
//		val sourceGenRoot = javaProject.getPackageFragmentRoot(sourceFolder);
		
		val oldEntries = javaProject.getRawClasspath();
		val newEntries = newArrayOfSize(oldEntries.length + 1);
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries.set(oldEntries.length, JavaCore.newSourceEntry(sourceRoot.getPath))
		javaProject.setRawClasspath(newEntries, null);
		
		// TODO: create Monitor
		javaProject.open(null)
		
		this.rootFSA = new EclipseFileSystemAccess(javaProject)
		this.srcgenFSA = new PrependPathFSA(this.rootFSA, SRC_GEN_FOLDER_NAME)
		
		return javaProject
	}
	
	public def reinitializeProject() {
		deleteProject
		createProject
		createJavaProject
	}
	
	def createProject() {
		val project = getProject()
		
		project.create(null)
		project.open(null)
	}
	
	public def getProject() {
		val root = ResourcesPlugin.getWorkspace().getRoot();
		val project = root.getProject(projectName);
		
		return project
	}
	
	public def IFileSystemAccess getRootFSA() {
		return rootFSA
	}
	
	public def IFileSystemAccess getSrcGenFSA() {
		return srcgenFSA
	}
}