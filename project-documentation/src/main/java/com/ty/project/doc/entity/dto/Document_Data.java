package com.ty.project.doc.entity.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Document_Data {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dataId;
	
	private String keyss;
	
	private String value;
	private LocalDateTime deletedAt;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
	
	public Integer getDataId() {
		return dataId;
	}
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}
	public String getKeyss() {
		return keyss;
	}
	public void setKeyss(String keyss) {
		this.keyss = keyss;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
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
		return "Document_Data [dataId=" + dataId + ", keyss=" + keyss + ", value=" + value + ", deletedAt=" + deletedAt
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
	

}
