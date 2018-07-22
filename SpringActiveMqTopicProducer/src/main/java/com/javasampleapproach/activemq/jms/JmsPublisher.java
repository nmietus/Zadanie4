package com.javasampleapproach.activemq.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.javasampleapproach.activemq.models.TekstXml;

@Component
public class JmsPublisher {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jsa.activemq.topic}")
	String topic;
	
	public void send(TekstXml apple){
		
		
		jmsTemplate.convertAndSend(topic, apple);
	}
}
