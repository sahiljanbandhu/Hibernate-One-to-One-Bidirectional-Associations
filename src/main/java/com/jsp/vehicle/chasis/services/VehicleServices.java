package com.jsp.vehicle.chasis.services;

import com.jsp.vehicle.chasis.dao.VehicleDao;
import com.jsp.vehicle.chasis.dto.Vehicle;

public class VehicleServices 
{
	VehicleDao vehicleDao = new VehicleDao();
	
	public Vehicle createVehicle(Vehicle vehicle) {
		return vehicleDao.createVehicle(vehicle);
	}

	public Vehicle getVehicleById(int id) {
		return vehicleDao.getVehicleById(id);
	}
	

	public Vehicle deleteVehicleById(int id) {
		return vehicleDao.deleteVehicleById(id);
	}

	public Vehicle updateVehicleById(int id, String name, String brand, int vehicle_no) {

		return vehicleDao.updateVehicleById(id, name,brand,vehicle_no);
	}
}
