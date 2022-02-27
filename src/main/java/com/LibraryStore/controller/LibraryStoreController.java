package com.LibraryStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.LibraryStore.model.LibraryStoreModel;
import com.LibraryStore.repository.LibraryStoreRepository;

@Controller
public class LibraryStoreController {
	
	@Autowired
	public LibraryStoreRepository librarystoreRepo;
	
	
	
	@GetMapping("/")
	public String addBookPage(LibraryStoreModel store) {
		return ("addtolibrary");
	}
	
	@PostMapping("/addbooks")
	public String addBooks( LibraryStoreModel library, BindingResult result, Model model ) {
		librarystoreRepo.save(library);
		return "redirect:/showallbooks";
	}
	
	@GetMapping("/showallbooks")
	public String displayAllBooks(Model model) {
		model.addAttribute ("LibraryStoreModel",librarystoreRepo.findAll());
		return ("displayallbooks");
	}
	

}
