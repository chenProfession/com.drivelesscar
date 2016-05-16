package com.drivelesscar.serviceImpl;

import com.drivelesscar.carexception.WestForwardException;
import com.drivelesscar.command.Command;
import com.drivelesscar.commandImpl.CommandImpl;
import com.drivelesscar.entity.Car;
import com.drivelesscar.service.CarService;

public class CarServiceImpl implements CarService {
    private final String str_cmmd_fst="clockwise";
    private final String str_cmmd_sec="forward";
    private final String str_Orient_n="north";
    private final String str_Orient_s="south";
    private final String str_Orient_e="east";
    private final String str_Orient_w="west";
	private Command cmmd=new CommandImpl();
	
	@Override
	public void move(String command,Car car) {
		if(command.equals(str_cmmd_fst))System.out.println(cmmd.clockwise(car));
		else if (command.equals(str_cmmd_sec)) {
			try {
				System.out.println(cmmd.forward(car));
			} catch (WestForwardException e) {
				e.printStackTrace();
				System.out.println("The car can not turn west!Please reset the car!");
			}
		}
		else {
			System.out.println("Can not find this command!");
		}
		
	}

	@Override
	public int getPositionX(Car car) {
		return car.getI_x();
	}

	@Override
	public int getPositionY(Car car) {
		return car.getI_y();
	}

	@Override
	public String getOrientation(Car car) {
		String temp="error";
		if(car.getI_north()==0){
			if(car.getI_east()>0)temp=str_Orient_e;
			else temp=str_Orient_w;
		}
		else {
			if(car.getI_north()>0)temp=str_Orient_n;
			else temp=str_Orient_s;
		}
		return temp;
	}

}
