package com.ygr.carmanage.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ygr.carmanage.model.Car;
import com.ygr.carmanage.server.CarServer;

@Controller
@RequestMapping()
public class CarController{
	@Autowired
	private CarServer carServer;
	
	/**
	 * 通过"/form"需要查找到页面
	 * @return
	 */
	@RequestMapping("/form")
	public String add(){
		return "/add_car";
	}
	
	@RequestMapping("/add")
	public String addCar(Car car, Model model ) {
		System.out.println("car:"+car);
		if(car.getId()==0){
			if(carServer.addCar(car)){
				return "redirect:/show.do";
			}else{
				model.addAttribute("mmm","车牌号已存在，请勿重复添加！");
				return "/add_car";
			}
		}else{
			carServer.updateCar(car);
			return "redirect:/show.do";
		}

		
	}
	@RequestMapping("/show")
	public String showAll(Model model ){
		
		ArrayList<Car> list=carServer.findAll();
		
		model.addAttribute("carList" ,list);
		
		return "/list_car";
		
	}
	@RequestMapping("/delete")
	public String delete( int id){
		carServer.deleteCarById(id);
		return "redirect:/show.do";
	}
	
	@RequestMapping("/update")
	public String update(Car c, Model model){
		
		Car car=carServer.getCarById(c.getId());
		model.addAttribute("car", car);
		
		return "/add_car";
		
	}

}
