package com.juaracoding.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juaracoding.main.services.ModelDosen;

@Controller
public class DosenPage {
	
	@Autowired
	ModelDosen modelDosen;
	
	@GetMapping("/dosen/view")
	public String viewIndexDosen(Model model) {
		
		model.addAttribute("listDosen",modelDosen.getAllDosen());
		
		return "view_dosen";
	}

}
