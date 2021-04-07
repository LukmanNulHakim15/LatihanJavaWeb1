package com.juaracoding.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.main.entity.Mahasiswa;

public interface MahasiswaRepository extends CrudRepository <Mahasiswa, Long>{
	
	public Mahasiswa findByNamaMahasiswa(String nama);

}
