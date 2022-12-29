package com.ty.project.doc.entity.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Document_Files {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer fileId;
	
	private String fileName;
	
	private String mime;
	private LocalDateTime deletedAt;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Document_Files [fileId=" + fileId + ", fileName=" + fileName + ", mime=" + mime + ", deletedAt="
				+ deletedAt + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	

}
