package com.jbk;

public class EncapTest {
	public static void main(String[] args) {
		EncapsulationDemo aa=new EncapsulationDemo();
		aa.setEmpssn(12228);
		aa.setEmpName("Sneha");
		aa.setEmpAge(25);
		
		int num=aa.getEmpAge();
		String num1=aa.getEmpName();
		int num2=aa.getEmpssn();
		
		System.out.println(num+ " "  +num1+" " +num2);
	}

}
