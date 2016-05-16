package com.drivelesscar.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.drivelesscar.entity.Car;
import com.drivelesscar.serviceImpl.CarServiceImpl;

public class CarDriveTest {

	@Test
	public void test() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int e1=0;
		try {
			e1=br.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Car car1=new Car(1,1,0,1);
		CarServiceImpl carServiceImpl=new CarServiceImpl();
		//carServiceImpl.move("clockwise", car1);
		//carServiceImpl.move("forward", car1);
		System.out.println(carServiceImpl.getOrientation(car1));
		System.out.println(carServiceImpl.getPositionX(car1)+","+carServiceImpl.getPositionY(car1));
	}

}
