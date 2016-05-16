package com.drivelesscar.entity;

public class Car {
   private int i_x;
   private int i_y;
   private int i_north;// (0,1) as north; (0,-1) as south;
   private int i_east;//(1,0) as east; (-1,0) as west;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int i_x, int i_y,int i_east,int i_north) {
		super();
		this.i_x = i_x;
		this.i_y = i_y;
		this.i_north = i_north;
		this.i_east = i_east;
	}

	public int getI_x() {
		return i_x;
	}

	public void setI_x(int i_x) {
		this.i_x = i_x;
	}

	public int getI_y() {
		return i_y;
	}

	public void setI_y(int i_y) {
		this.i_y = i_y;
	}

	public int getI_north() {
		return i_north;
	}

	public void setI_north(int i_north) {
		this.i_north = i_north;
	}

	public int getI_east() {
		return i_east;
	}

	public void setI_east(int i_east) {
		this.i_east = i_east;
	}
   
}
