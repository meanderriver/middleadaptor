package org.ma.message.model;

import java.io.Serializable;

public class SendResult implements Serializable{
	
	private boolean isSuccess;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	

}
