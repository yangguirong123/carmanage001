package com.ygr.carmanage.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.hql.internal.ast.tree.SessionFactoryAwareNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ygr.carmanage.dao.CarDao;
import com.ygr.carmanage.model.Car;
@Repository("carDao")
public class CarDaoImpl implements CarDao {
	@Autowired
	private SessionFactory sessionFactory;
		
	
	@Override
	public void addCar(Car  car) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(car);
		session.getTransaction().commit();
	}

	@Override
	public ArrayList<Car> findAll() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Car> list=session.createQuery("FROM Car").list();
		session.getTransaction().commit();
		return (ArrayList<Car>) list;
	}

	@Override
	public Car getCarById(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Car AS c WHERE c.id=:id");
		query.setParameter("id", id);
		Car car=(Car) query.uniqueResult();
		session.getTransaction().commit();
		return car;
	}

	@Override
	public void deleteCarById( int id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Car car=(Car) session.get(Car.class, id);
		session.delete(car);
		session.getTransaction().commit();
	}

	@Override
	public void updateCar(Car car) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(car);
		session.getTransaction().commit();
	}

	@Override
	public Car getCarBycarNumer(String carNumber) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Car AS c WHERE c.carNumber=:carNumber");
		query.setParameter("carNumber", carNumber);
		Car car=(Car) query.uniqueResult();
		session.getTransaction().commit();
		return car;
	}

}
