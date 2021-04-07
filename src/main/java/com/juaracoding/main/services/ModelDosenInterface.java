package com.juaracoding.main.services;

import java.util.List;

import com.juaracoding.main.entity.Dosen;

public interface ModelDosenInterface {
	
	public List<Dosen> getAllDosen ();
	public Dosen getDosenByName(String nama);

}
