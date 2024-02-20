package com.beingabroad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beingabroad.model.Institute;
@Repository
public interface InstituteRepository extends JpaRepository<Institute, Integer>{

}
