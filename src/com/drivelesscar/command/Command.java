package com.drivelesscar.command;

import com.drivelesscar.carexception.WestForwardException;
import com.drivelesscar.entity.Car;

public interface Command {
   public String clockwise(Car car);
   public String forward(Car car) throws WestForwardException;
}
