package com.ygr.carmanage.serverimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ygr.carmanage.dao.CarDao;
import com.ygr.carmanage.model.Car;
import com.ygr.carmanage.server.CarServer;
@Service("carServer")
public class CarServerImpl implements CarServer {
	@Autowired
	private CarDao carDao;

	@Override
	public boolean addCar(Car car) {
		//如果根据车牌号查询不到汽车，那么就可以添加，因为车牌号是不能重复的
		String carNumber=car.getCarNumber();
		if (carDao.getCarBycarNumer(carNumber) == null) {
			carDao.addCar(car);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public ArrayList<Car> findAll() {
		ArrayList<Car> list=carDao.findAll();
		return list;
		
	}

	@Override
	public void deleteCarById(int id) {
		carDao.deleteCarById(id);
	}

	@Override
	public void updateCar(Car car) {
		
		carDao.updateCar(car);
	}

	@Override
	public Car getCarById(int id) {
		Car car=carDao.getCarById(id);
		
		return car;
	}

}
