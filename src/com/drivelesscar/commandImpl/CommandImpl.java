package com.drivelesscar.commandImpl;

import com.drivelesscar.carexception.WestForwardException;
import com.drivelesscar.command.Command;
import com.drivelesscar.entity.Car;

public class CommandImpl implements Command {

	@Override
	public String clockwise(Car car) {  //the car point to the position (x+sin(angle),y-sin(angle)); 
		int i_present_n=car.getI_north();
		int i_present_e=car.getI_east();
		double i_angle=Math.PI/2;
		
		if(i_present_n<0)i_angle=-i_angle;
		try {
			i_present_e=(int) (i_present_e+Math.sin(i_angle));
			i_present_n=(int) (i_present_n-Math.sin(i_angle));
		} catch (Exception e) {
			e.printStackTrace();
		}
		car.setI_east(i_present_e);
		car.setI_north(i_present_n);	
		
		return "Orientation: ("+i_present_e+","+i_present_n+")";//+i_angle+Math.sin(i_angle);
	}

	@Override
	public String forward(Car car) throws WestForwardException {
		int i_present_x=car.getI_x()+car.getI_east();
		int i_present_y=car.getI_y()+car.getI_north();
		car.setI_x(i_present_x);
		car.setI_y(i_present_y);
		if(car.getI_east()<0)throw new WestForwardException("West error 001");
		return "Position: ("+i_present_x+","+i_present_y+")";
	}

}
