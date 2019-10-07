package com.jbk.school;

public class Students {
	private String name;
	private int phyMarks;
	private int chemMarks;
	private int bioMarks;
	public void setName(String name) {
		this.name = name;
	}
	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	public void setBioMarks(int bioMarks) {
		this.bioMarks = bioMarks;
	}
// create method to print student name marks of three subject and percentage
void marksRead() {
	System.out.println("student name is "+name);
	System.out.println("Student phymarks is "+phyMarks);
	System.out.println("Student chemistry marks is "+chemMarks);
	System.out.println("Student bio marks is "+bioMarks);
	int totalMarks=phyMarks+chemMarks+bioMarks;
	System.out.println("total marks is:"+totalMarks);
	float percentage=(totalMarks*100)/3;
	System.out.println("student percentage is "+percentage);
	System.out.println();

}
}