package org.ma.message.kafka.service;

import org.ma.message.service.Producer;
import org.ma.message.service.ProducerFactory;


public class KafkaProducerFactory extends ProducerFactory {
	
	
	@Override
	public Producer getProducerInner(String type) {
		return new KafkaProducer();
	}
	

}
