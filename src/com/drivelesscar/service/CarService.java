package com.drivelesscar.service;

import com.drivelesscar.entity.Car;

public interface CarService {
	public void move(String command,Car car);
	public int getPositionX(Car car);
	public int getPositionY(Car car);
    public String getOrientation(Car car);
}
