package com.logging.appender.smtp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service2 {
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(Service2.class);

	public void exemploErro() {
		LOGGER.error("Erro service 2");
	}
}
