package io.springboot.starter.model;

import javax.persistence.Entity;

@Entity
public class Point {
	
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return ("X = " + this.x + ", Y = " + this.y);
	}

}