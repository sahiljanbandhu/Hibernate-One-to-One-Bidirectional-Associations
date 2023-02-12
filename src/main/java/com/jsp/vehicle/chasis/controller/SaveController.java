package com.jsp.vehicle.chasis.controller;

import com.jsp.vehicle.chasis.dto.Chasis;
import com.jsp.vehicle.chasis.dto.Vehicle;
import com.jsp.vehicle.chasis.services.ChasisServices;
import com.jsp.vehicle.chasis.services.VehicleServices;

public class SaveController 
{
	public static void main(String[] args) 
	{
		VehicleServices vehicleServices = new VehicleServices();
		ChasisServices chasisServices = new ChasisServices();
		Vehicle vehicle = new Vehicle();
		Chasis chasis = new Chasis();
		
		chasis.setOwner_name("sahil");
		chasis.setChasis_no(35782);
		chasis.setVehicle(vehicle);
		chasisServices.createChasis(chasis);
		
		vehicle.setName("Maruti");
		vehicle.setBrand("Tata");
		vehicle.setVehicle_no(56272);
		vehicle.setChasis(chasis);
		vehicleServices.createVehicle(vehicle);				
	}
}
