package com.prakash.spring;

public class Triangle {

	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("PointA: X=" + this.pointA.getX() + " Y=" + this.pointA.getY());
		System.out.println("PointB: X=" + this.pointB.getX() + " Y=" + this.pointB.getY());
		System.out.println("PointC: X=" + this.pointC.getX() + " Y=" + this.pointC.getY());
	}

}
