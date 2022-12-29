package com.ty.project.doc.service;

import java.util.List;

import com.ty.project.doc.entity.dto.Projects;

public interface ProjectService {
	
	public Projects saveData(Projects projects);
	
	public List<Projects> getAllData();
	
	public List<Projects> getData(String profusionUserId);
	
	public void deleteByID(Integer proId);
	
	public Projects updateData(Projects projects);
	
	
	

}
