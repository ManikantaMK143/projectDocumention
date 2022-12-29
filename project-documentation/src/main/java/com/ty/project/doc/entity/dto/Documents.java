package com.ty.project.doc.entity.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Documents {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	private Integer documentType;
	private LocalDateTime deletedAt;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "docId")
	private List<Document_Files> document_Files;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "docId")
	private List<Document_Data> document_Data;

	@ManyToOne(cascade = CascadeType.ALL)
	private Document_Type document_Type;

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public Integer getDocumentType() {
		return documentType;
	}

	public void setDocumentType(Integer documentType) {
		this.documentType = documentType;
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

	public List<Document_Files> getDocument_Files() {
		return document_Files;
	}

	public void setDocument_Files(List<Document_Files> document_Files) {
		this.document_Files = document_Files;
	}

	public List<Document_Data> getDocument_Data() {
		return document_Data;
	}

	public void setDocument_Data(List<Document_Data> document_Data) {
		this.document_Data = document_Data;
	}

	public Document_Type getDocument_Type() {
		return document_Type;
	}

	public void setDocument_Type(Document_Type document_Type) {
		this.document_Type = document_Type;
	}

	@Override
	public String toString() {
		return "Documents [docId=" + docId + ", documentType=" + documentType + ", deletedAt=" + deletedAt
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", document_Files=" + document_Files
				+ ", document_Data=" + document_Data + ", document_Type=" + document_Type + "]";
	}

}
