package com.javasampleapproach.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.activemq.jms.JmsPublisher;
import com.javasampleapproach.activemq.models.OdczytPliku;
import com.javasampleapproach.activemq.models.TekstXml;

@SpringBootApplication
public class SpringActiveMqTopicProducerApplication implements CommandLineRunner {

	@Autowired
	JmsPublisher publisher;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringActiveMqTopicProducerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		OdczytPliku op = new OdczytPliku();
		op.odczyt();
		op.zapiszTekst();
		
		TekstXml samsung = new TekstXml(op.getTekst());
	
        /*
         * send message to ActiveMQ
         */
		publisher.send(samsung);
	}
}
