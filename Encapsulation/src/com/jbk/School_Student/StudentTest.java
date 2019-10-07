package com.jbk.School_Student;

public class StudentTest {

	public static void main(String[] args) {
		Student st= new Student();
		st.setStdName("Kiran");
		st.setStdRollNo(12);
		st.setStdId(12481);
		
		System.out.println("Student Name is"+ st.getStdName());
		System.out.println("Student Roll No is :"+st.getStdRollNo());
		System.out.println("Student Id no:"+st.getStdId());
	}

}
