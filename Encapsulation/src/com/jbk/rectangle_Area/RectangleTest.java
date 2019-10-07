package com.jbk.rectangle_Area;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rr= new Rectangle(20,30);
		int rlh=rr.getLength();
		int rbh=rr.getBreadth();
		int Area=rlh*rbh;
		System.out.println(Area);
		
		rr.setLength(60);
		rr.setBreadth(20);
		int x=rr.getLength();
		int y=rr.getBreadth();
		int Area1=x*y;
		System.out.println(Area1);
	}

}
