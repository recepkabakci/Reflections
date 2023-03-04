package com.recepkabakci.forname;

public class ClassRoom {
	
	private String name;
	private int numOffStudents;
	private boolean weekOfEndClass;

	public ClassRoom(String name, int numOffStudents) {
		super();
		this.name = name;
		this.numOffStudents = numOffStudents;
	}

	public ClassRoom(String name, int numOffStudents, boolean weekOfEndClass) {
		this(name, numOffStudents);
		this.name = name;
		this.weekOfEndClass = weekOfEndClass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOffStudents() {
		return this.numOffStudents;
	}

	public void setNumOffStudents(int numOffStudents) {
		this.numOffStudents = numOffStudents;
	}

	public boolean isWeekOfEndClass() {
		return this.weekOfEndClass;
	}

	public void setWeekOfEndClass(boolean weekOfEndClass) {
		this.weekOfEndClass = weekOfEndClass;
	}

	@Override
	public String toString() {
		return "ClassRoom [name=" + this.name + ", numOffStudents=" + this.numOffStudents + ", weekOfEndClass="
				+ this.weekOfEndClass + "]";
	}
	

}
