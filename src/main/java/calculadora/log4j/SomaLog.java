package calculadora.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SomaLog {

	private static final Logger logger = LogManager.getLogger(SomaLog.class);
	
	public static void main(String[] args) {
		 int a = 10, b = 5;
	        logger.info("Iniciando soma no Eclipse...");
	        logger.debug("Valores: {} e {}", a, b);
	        System.out.println("Resultado: " + (a + b));
	        logger.info("Finalizado.");
	}
}
