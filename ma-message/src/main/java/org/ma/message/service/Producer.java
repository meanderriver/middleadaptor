package org.ma.message.service;

import org.ma.message.model.SendResult;

public interface Producer {
	public SendResult send(String topic,String message);
}
