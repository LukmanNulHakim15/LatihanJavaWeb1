package com.juaracoding.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.juaracoding.main.services.ModelMahasiswa;

@Controller
public class HomePage {
	

	
	
	@GetMapping ("/")
	public String viewHomePage (Model model) {
		
		
		//model.addAttribute("mahasiswa",mahasiswaRepo.findAll());    //Fungsinya menampilkan semua data mahasiswa
		//model.addAttribute("mahasiswa","Hallo ini gua Lukman"); //akan menampilkan hallo ini gua lukman
		//model.addAttribute("lukman","Laper pengen makan"); // Jadi index.html didalam kurung kurawal harus menyamakan parameter
		
		return "index";
		//Setiap penamwaan file.html jangan menggunakan nama index.html karna nama tersebut default
	}
	
	/* @GetMapping ("/lukman")
	public  String lukman (@RequestParam String pesan, Model model) {
		
		model.addAttribute("pesan", pesan);
		return "lukman";
	} */


}
