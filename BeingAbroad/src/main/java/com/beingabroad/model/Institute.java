package com.beingabroad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Institute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instituteId;
	
	@NotBlank(message = "Institute name is required")
    @Size(max = 200, message = "Institute name must be at most 200 characters")
	private String instituteName;
	
	@NotBlank(message = "Institute location is required")
    @Size(max = 255, message = "Institute location must be at most 255 characters")
	private String instituteLocation;
	
	@NotBlank(message = "Contact information is required")
    @Size(max = 300, message = "Contact information must be at most 300 characters")
	private String instituteContactInfo ;
	
	

}
