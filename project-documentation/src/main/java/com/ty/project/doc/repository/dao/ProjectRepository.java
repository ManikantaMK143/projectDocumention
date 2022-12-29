package com.ty.project.doc.repository.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.project.doc.entity.dto.Projects;

@Repository
public interface ProjectRepository extends JpaRepository<Projects, Integer> {
	
	List<Projects> findByProfusionUserId(String profusionUserId);
	
}
