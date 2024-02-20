package com.beingabroad.serviceInterface;

import com.beingabroad.model.Institute;

public interface InstituteServiceInterface {
	
	public Institute registerInstitute(Institute institute);
	public Institute modifyInstituteInformation(int instituteId, Institute institute);
	public Institute getInstitute(int instituteId);

}
