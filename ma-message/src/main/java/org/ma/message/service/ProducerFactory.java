package org.ma.message.service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ProducerFactory {
	
	private static ProducerFactory producerFactory = null;
	
	public static Producer getProducer(String type) {
		if(producerFactory == null) {
			producerFactory = new ProducerFactory();
		}
		return producerFactory.getProducerInner(type);
	}
	
	public Producer getProducerInner(String type) {
		Producer producer = null;
		ServiceLoader<ProducerFactory> spiLoader = ServiceLoader.load(ProducerFactory.class);
		Iterator<ProducerFactory> iaIterator = spiLoader.iterator();  
        while (iaIterator.hasNext()) {  
            producer = iaIterator.next().getProducerInner("");
        }  
		return producer;
	}

}
