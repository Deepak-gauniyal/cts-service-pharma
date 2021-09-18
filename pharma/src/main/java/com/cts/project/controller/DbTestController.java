package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.MedicineDAO;
import com.cts.project.model.Medicine;
import com.cts.project.repository.MedicineRepository;

@RestController
public class DbTestController {
	
	@Autowired
	MedicineDAO medDao;
	
	@Autowired
	private MedicineRepository medRepo;

	@GetMapping("/db/medicine/{medName}")
	public Optional<Medicine> getMedicine(@PathVariable String medName) {
		
		Optional<Medicine> med=medRepo.findById(medName);
		return med;
		
		//return medDao.findMedicine(medName);

	}

	@GetMapping("/db/medicines")
	public String getMedicines() {
	//public List<Medicine> getMedicines() {
		List<Medicine> medlist=medRepo.findAll();
		String message="";
		int count=1;
		for(Medicine temp:medlist) {
			message+="Medicine Number "+count+"<br><br>";
			message+="Name : "+temp.getName()+"<br>"+"Price : "+temp.getPrice()+"<br><br>";
			message+="===========================================================<br><br>";
			count+=1;
			
		}
		
		return message;
		//return medDao.getAllMedicine();

	}
	
	@PostMapping("/db/medicine")
	public String postMedicine(/*@RequestBody*/ Medicine med) {
		
		//medDao.addMedicine(med);
		medRepo.save(med);
		System.out.println(med.getName()+","+med.getPrice()+","+med.getComposition());
		return "<a href=http://localhost:8085/pharma/db/medicines>Click</a>";
		
		
	}

}
