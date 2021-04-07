package com.juaracoding.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.main.entity.Dosen;

public interface DosenRepository extends CrudRepository <Dosen, Long> {
	
	public Dosen findByNamaDosen (String Nama) ;
		
	
}
