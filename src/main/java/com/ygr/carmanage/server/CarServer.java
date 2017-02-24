package com.ygr.carmanage.server;

import java.util.ArrayList;

import com.ygr.carmanage.model.Car;

public interface CarServer {
	
	boolean addCar(Car car);
	
	ArrayList<Car> findAll();
	
	void deleteCarById(int id);
	
	void updateCar(Car car);
	
	Car getCarById(int id);
}
