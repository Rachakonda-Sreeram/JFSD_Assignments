package com.hexaware.cricket.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayerNotFound extends Exception {
	
	Logger logger = LoggerFactory.getLogger(PlayerNotFound.class);
	
	 public PlayerNotFound(String message) {
	        super(message);
	        logger.error(message);
	    }

}
