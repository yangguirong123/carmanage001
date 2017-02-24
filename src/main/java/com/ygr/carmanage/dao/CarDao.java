package com.ygr.carmanage.dao;

import java.util.ArrayList;

import com.ygr.carmanage.model.Car;

public interface CarDao {
	
	Car getCarById(int id);
	
	Car getCarBycarNumer(String carNumber);
	
	void addCar(Car  car);
	
	ArrayList<Car>  findAll();
	
	void deleteCarById(int id);
	
	void updateCar(Car car);
	
	
	
}
