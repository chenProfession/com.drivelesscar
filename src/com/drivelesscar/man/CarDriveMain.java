package com.drivelesscar.man;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.drivelesscar.entity.Car;
import com.drivelesscar.serviceImpl.CarServiceImpl;

public class CarDriveMain {

	public static void main(String[] args) {
		Car car=new Car();
		CarServiceImpl carServiceImpl=new CarServiceImpl();

		while(true){
		  System.out.println("The car initially positioned at X = 1 and Y = 1");
		  System.out.println("Please select which direction the car is facing:");
		  System.out.println("1.north");
		  System.out.println("2.east");
		  System.out.println("3.west");
		  System.out.println("4.south");
		  System.out.println("5.exit the program");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		  
		  int i_select=1;
			try {
				//input=br.readLine();
				i_select = Integer.valueOf(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i_select==5){System.out.println("bye~~~");break;}
			switch (i_select) {
			case 1:
                //car=new Car(1,1,0,1);
				car.setI_x(1);
				car.setI_y(1);
				car.setI_east(0);
				car.setI_north(1);
				break;
			case 2:
                //car=new Car(1,1,1,0);
				car.setI_x(1);
				car.setI_y(1);
				car.setI_east(1);
				car.setI_north(0);
				break;
			case 3:
                //car=new Car(1,1,-1,0);
				car.setI_x(1);
				car.setI_y(1);
				car.setI_east(-1);
				car.setI_north(0);
				break;
			case 4:
                //car=new Car(1,1,0,-1);
				car.setI_x(1);
				car.setI_y(1);
				car.setI_east(0);
				car.setI_north(-1);
				break;
			default:
				break;
			}
		  System.out.println("Please select the command:"+i_select);
	      System.out.println("1.clockwise");
		  System.out.println("2.forward");
		  BufferedReader br1=new BufferedReader(new InputStreamReader(System.in)); 
		  int i_select1=0;
			try {
				i_select1=Integer.valueOf(br1.readLine());
			} catch (IOException e) {
				// TODO: handle exception
			}		  
			switch (i_select1) {
			case 1:
				carServiceImpl.move("clockwise", car);
				break;
			case 2:
				carServiceImpl.move("forward", car);
				break;
			default:
				break;
			}
			System.out.println(carServiceImpl.getOrientation(car));
			System.out.println("("+carServiceImpl.getPositionX(car)+","+carServiceImpl.getPositionY(car)+")");
			
		}
	}

}
