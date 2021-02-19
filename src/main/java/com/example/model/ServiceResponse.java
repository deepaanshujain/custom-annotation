package com.example.model;

public class ServiceResponse {
	//private static final long serialVersionUID = 1L;
	private int responseCode;
	private String responseMessage;
	private Object responseData;
	
	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}

	public ServiceResponse(int responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	public ServiceResponse(){}

	public ServiceResponse(int responseCode,  String responseMessage,Object responseData){
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.responseData=responseData;
	}

	@Override
	public String toString() {
		return "ServiceResponse [responseCode=" + responseCode + ", responseMessage=" + responseMessage
				+ ", responseData=" + responseData + "]";
	}
	
	
	
	
}
