package org.ma.message.kafka.service;

import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.ma.message.model.SendResult;
import org.ma.message.service.Producer;

public class KafkaProducer implements Producer{
	
	private org.apache.kafka.clients.producer.Producer<String, String> producer;
	
	public KafkaProducer() {
		producer = new org.apache.kafka.clients.producer.KafkaProducer<String,String>(System.getProperties());
	}

	public SendResult send(String topic,String message) {
		SendResult result = new SendResult();
		ProducerRecord<String,String> record = new ProducerRecord(topic,message);
		try {
		  producer.send(record);
		  result.setSuccess(true);
		}catch(Throwable e) {
		  e.printStackTrace();
		  result.setSuccess(false);	
		}
		return result;
	}
	
	
	

}
