package com.ty.project.doc.response.dto;

public class AppResponse {

	private String code;
	private String message;
	private Object object;

	public AppResponse() {

	}

	public AppResponse(String code, String message, Object object) {
		super();
		this.code = code;
		this.message = message;
		this.object = object;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
