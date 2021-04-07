package com.juaracoding.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.main.entity.Dosen;
import com.juaracoding.main.entity.Mahasiswa;
import com.juaracoding.main.repository.DosenRepository;


@Service
public class ModelDosen implements ModelDosenInterface {
	
	@Autowired
	DosenRepository dosenRepo;

	@Override
	public List<Dosen> getAllDosen() {
		// TODO Auto-generated method stub
		return (List<Dosen>) this.dosenRepo.findAll();
	}

	@Override
	public Dosen getDosenByName(String nama) {
		// TODO Auto-generated method stub
		return this.dosenRepo.findByNamaDosen(nama);
	}

	
	

}
