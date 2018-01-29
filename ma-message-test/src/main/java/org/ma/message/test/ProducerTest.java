package org.ma.message.test;

import org.ma.message.model.SendResult;
import org.ma.message.service.Producer;
import org.ma.message.service.ProducerFactory;


public class ProducerTest {

	public static void main(String[] args) {
		System.setProperty("bootstrap.servers", "localhost:9092");
		System.setProperty("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
		System.setProperty("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
		System.setProperty("producer.type","sync");
		System.setProperty("request.required.acks","1");
		Producer producer = ProducerFactory.getProducer("kalfka");
		SendResult result = producer.send("lc","hello world");
		System.out.println(result);

	}

}
