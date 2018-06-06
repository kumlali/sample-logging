package com.kumlali.sample.logging;

public class Main {

  private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Main.class);
  
  public static void main(String[] args) {
    logger.trace("Trace log");
    logger.warn("Warning log");
    logger.info("Info log");
    logger.debug("Debug log");
    logger.error("Error log");
  }

}
