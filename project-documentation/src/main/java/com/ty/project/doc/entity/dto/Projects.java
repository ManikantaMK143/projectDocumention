package com.ty.project.doc.entity.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity

public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer proId;
	 
	private String profusionUserId;
	 
	private String contactName;
	 
	private String projectName;
	 
	private LocalDateTime createdBy;
	 
	private LocalDateTime updatedBy;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "proId")
	 
	private List<Documents> documents;

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProfusionUserId() {
		return profusionUserId;
	}

	public void setProfusionUserId(String profusionUserId) {
		this.profusionUserId = profusionUserId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDateTime getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(LocalDateTime createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(LocalDateTime updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<Documents> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}

}
