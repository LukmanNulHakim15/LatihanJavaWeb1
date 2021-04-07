package com.juaracoding.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juaracoding.main.services.ModelMahasiswa;

@Controller
public class MahasiswaPage {
	
	@Autowired
	ModelMahasiswa modelMahasiswa;
	
	
	@GetMapping ("/mahasiswa/view")
	public String lukman (Model model) {
		
		model.addAttribute("listMahasiswa", modelMahasiswa.getAllMahasiswa());
		
		return "view_mahasiswa";
	}

}
