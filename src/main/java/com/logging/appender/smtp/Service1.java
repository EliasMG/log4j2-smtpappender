package com.logging.appender.smtp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service1 {
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(Service1.class);

	public void exemploErro() {
		LOGGER.error("Erro service 1");
	}
}