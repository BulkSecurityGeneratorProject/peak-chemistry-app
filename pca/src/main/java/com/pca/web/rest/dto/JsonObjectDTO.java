package com.pca.web.rest.dto;

import java.io.Serializable;

public class JsonObjectDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3833486209256934598L;
	
	private boolean success;
	
	private Object data;
	
	private String message;
	
	public JsonObjectDTO (){
		
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
