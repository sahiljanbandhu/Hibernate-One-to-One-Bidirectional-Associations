package com.jsp.vehicle.chasis.services;

import com.jsp.vehicle.chasis.dao.ChasisDao;
import com.jsp.vehicle.chasis.dto.Chasis;

public class ChasisServices {
	ChasisDao chasisDao = new ChasisDao();

	public Chasis createChasis(Chasis chasis) {
		return chasisDao.createChasis(chasis);
	}

	public Chasis getChasisById(int id) {
		return chasisDao.getChasisById(id);
	}

	public Chasis deleteChasisById(int id) {
		return chasisDao.deleteChasisById(id);
	}

	public Chasis updateChasisById(int id, String owner_name, int chasis_no) {

		return chasisDao.updateChasisById(id, owner_name, chasis_no);
	}

}
