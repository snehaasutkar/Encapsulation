package com.jbk;

public class Encap {
	private int weight;
		
		//this.weight = weight;
		
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int wt) {
if (wt<0)
	System.out.println("enter weight greater than 0");
else
	weight=wt;
System.out.println(wt);
	}
	public static void main(String[] args) {
		Encap obj=new Encap();
		obj.setWeight(-1);
			
		}
	}
	
