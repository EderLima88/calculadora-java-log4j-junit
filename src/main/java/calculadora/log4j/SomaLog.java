package calculadora.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SomaLog {

	private static final Logger logger = LogManager.getLogger(SomaLog.class);
	
	public static void main(String[] args) {
		 int a = 10, b = 5;
	        logger.info("Iniciando soma no Eclipse...");
	        
	        int resultado = somar(a, b);
	        
	        
	        //logger.debug("Valores: {} e {}", a, b);
	        System.out.println("Resultado: " + resultado);
	        logger.info("Finalizado.");
	}
	
		public static int somar(int n1, int n2) {
			logger.debug("Metodo somar() foi chamado com os parametros: {} e {}", n1, n2);
			
			int soma = n1 + n2;
			
			logger.info("Calculo realizado: {} + {} = {}", n1, n2, soma);
			return soma;
		}
	
}
