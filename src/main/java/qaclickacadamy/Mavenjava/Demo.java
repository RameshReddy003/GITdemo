package qaclickacadamy.Mavenjava;

import org.apache.logging.log4j.*;


public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("im debugging");
		log.info("object is present");
		log.error("it is error");
		log.fatal("im fatal");

	}

}
