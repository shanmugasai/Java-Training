package com.ibm.objectclass;

class Point{
	static int x;
	static int y;
	@Override
	public boolean equals(Object obj) {
		if(target!=null && target instanceof Point) {
			Point point2=(Point)target;
			if(this.x==point2.x && this.y==point2.y) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}

public class Application
{
	public static void main( String[] args )
	{
		Point point1,point2;
		point1 = new Point();
		point2 = new Point();
		
		point1.x=2;
		point1.y=4;
		
		point2.x=2;
		point2.y=2;
		
		
	}
}