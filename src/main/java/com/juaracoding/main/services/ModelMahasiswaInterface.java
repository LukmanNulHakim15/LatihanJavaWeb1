package com.juaracoding.main.services;

import java.util.List;

import com.juaracoding.main.entity.Mahasiswa;

public interface ModelMahasiswaInterface {
	
	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiswaByName (String name);

}
