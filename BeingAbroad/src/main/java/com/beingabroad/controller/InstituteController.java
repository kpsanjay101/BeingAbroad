package com.beingabroad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beingabroad.model.Institute;
import com.beingabroad.serviceInterface.InstituteServiceInterface;

import jakarta.validation.Valid;


@RestController
@RequestMapping("Institute")
public class InstituteController {
	
	@Autowired
	private InstituteServiceInterface instituteService;
	
	@PostMapping("/registerInstitute")
	public ResponseEntity<Institute> addNewInstitute(@Validated @RequestBody Institute institute){
		Institute inst = instituteService.registerInstitute(institute);
		return new ResponseEntity<Institute>(inst, HttpStatus.OK);
	}
	
	@PatchMapping("/updateInstitute/{instituteId}")
	public ResponseEntity<Institute> modifyInstitute(@PathVariable Integer instituteId, @Valid @RequestBody Institute institute){
		Institute inst = instituteService.modifyInstituteInformation(instituteId, institute);
		return new ResponseEntity<Institute>(inst, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findInstituteById/{instituteId}")
	public ResponseEntity<Institute> FindInstituteById(@PathVariable Integer instituteId){
		Institute inst = instituteService.getInstitute(instituteId);
		return new ResponseEntity<>(inst,HttpStatus.ACCEPTED);
		
	}

}
