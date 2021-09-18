package com.cts.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.project.dao.MedicineDAO;
import com.cts.project.model.Medicine;

@Controller
public class PharmaAPI {
	
	@Autowired
	MedicineDAO medDao;

	@GetMapping("/medicine/{medName}")
	@ResponseBody
	public Medicine getMedicine(@PathVariable String medName) {
		
		return medDao.findMedicine(medName);

	}

	@GetMapping("/medicines")
	@ResponseBody
	public List<Medicine> getMedicines() {
		
		return medDao.getAllMedicine();

	}
	
	@PostMapping("/medicine")
	public String postMedicine( Medicine med) {
		
		medDao.addMedicine(med);
		return "click";
		
		
	}

}
