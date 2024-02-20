package com.beingabroad.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beingabroad.exception.InstituteNotFoundException;
import com.beingabroad.model.Institute;
import com.beingabroad.repository.InstituteRepository;
import com.beingabroad.serviceInterface.InstituteServiceInterface;

@Service
public class InstituteServiceImplementation implements InstituteServiceInterface{
	
	@Autowired
	private InstituteRepository instituteRepo;

	@Override
	public Institute registerInstitute(Institute institute) {
		// TODO Auto-generated method stub existInstitute 
		Optional<Institute> optional = instituteRepo.findById(institute.getInstituteId());
		if(!optional.isEmpty()) {
			throw new InstituteNotFoundException("Institute is already exist with this instituteId: "+institute.getInstituteId());
		}
		return instituteRepo.save(institute);
		 
	}

	@Override
	public Institute modifyInstituteInformation(int instituteId, Institute updatedInstitute) {
		// TODO Auto-generated method stub
		Optional<Institute> optional = instituteRepo.findById(instituteId);
		if(optional.isEmpty()) {
			throw new InstituteNotFoundException("Institute is not exist with this id: "+instituteId);
		}
		Institute existInstitute = optional.get();
		existInstitute.setInstituteName(updatedInstitute.getInstituteName());
		existInstitute.setInstituteLocation(updatedInstitute.getInstituteLocation());
		existInstitute.setInstituteContactInfo(updatedInstitute.getInstituteContactInfo());
		
		return instituteRepo.save(existInstitute);
	}

	@Override
	public Institute getInstitute(int instituteId) {
		// TODO Auto-generated method stub
		Optional<Institute> optional = instituteRepo.findById(instituteId);
		if(optional.isEmpty()) {
			throw new InstituteNotFoundException("Institute is not exist with this id: "+instituteId);
		}
		Institute existInstitute = optional.get();
		return existInstitute;
	}

}
