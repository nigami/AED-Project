package tree;

import java.util.ArrayList;
import java.util.HashMap;
public class TopologicalSort {

	/*
	 * Given Project lists and dependencies list
	 * create a output order in a sequence the projects must be build 
	 * to not violent the dependencies.
	 * If there is no way to create such a output return null, in case of error
	 */
	
	/*
	 * Return an array of projects in sequence of build
	 */
	class Project{
		
		String name;
		int dependencies=0;
		ArrayList<Project> children= new ArrayList<Project>();
		HashMap<String, Project> childMap= new HashMap<String, Project>();
		
		public Project(){
			name=null;
		}
		
		public Project(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		public void addDependencies(){
			dependencies++;
		}
		
		public void decDependencies(){
			dependencies--;
		}
		public void addEdge(Project start, Project end){
			children.add(end);
			getChildMap().put(start.getName(), start);
			addDependencies();
		}
		
		public ArrayList<Project> getChildren(){
			return children;
		}
		
		public HashMap getChildMap(){
			return childMap;
		}
	}
	
	class Graph{
		ArrayList<Project> projects= new ArrayList<Project>();
		HashMap<String, Project> projMap= new HashMap<String, Project>();
		
		public Project createOrGetProject(String name){
			if(projMap.get(name)==null){
				Project project= new Project(name);
				projects.add(project);
				projMap.put(name, project);
				return project;
			}
			return projMap.get(name);
		}
		
		public void createDependency(String start, String end){
			Project startProj= createOrGetProject(start);
			Project endProj= createOrGetProject(end);
			startProj.addEdge(startProj,endProj);
		}
	}
	
	public Graph buildGraph(String[] projects, String[][] dependencies){
		Graph g= new Graph();
		for(String name: projects){
			g.createOrGetProject(name);
		}
		int count=0;
		while(count< dependencies.length){
			g.createDependency(dependencies[count][0],dependencies[count][1]);
		}
		return g;
	}
	public Project[] buildSequenceProject(String[] projects, String[][] dependencies){
		
		
		
		return null;
	}
}
