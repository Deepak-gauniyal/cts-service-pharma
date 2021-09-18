package com.cts.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cts.project.model.Medicine;

@Component
public class MedicineDAO {
	
	private static List<Medicine> medicines;
	
	public MedicineDAO(){
		
		if (medicines==null) {
			medicines=new ArrayList<Medicine>();
		}
		
	}
	
	public void addMedicine(Medicine med) {
		
		medicines.add(med);
		
	}
	
	public Medicine findMedicine(String medName) {
		for(Medicine temp:medicines) {
			if(temp.getName().equalsIgnoreCase(medName)) {
				return temp;
			}
		}
		return null;
	}
	
	public List<Medicine> getAllMedicine(){
		return medicines;
	}

}
