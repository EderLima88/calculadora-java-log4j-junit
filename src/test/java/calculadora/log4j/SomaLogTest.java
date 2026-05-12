package calculadora.log4j;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SomaLogTest {
    @Test
    @DisplayName("Deve retornar 15 ao somar 10 e 5")
    void testSomar() {
        // 1. Cenário (Input)
        int a = 10;
        int b = 5;

        // 2. Execução (Chamando o método da sua classe principal)
        int resultado = SomaLog.somar(a, b);

        // 3. Verificação (O que o JUnit espera)
        // assertEquals(esperado, atual, mensagem de erro)
        assertEquals(15, resultado, "O cálculo da soma está incorreto!");
    }

    @Test
    @DisplayName("Teste com valores negativos")
    void testSomarNegativos() {
        int resultado = SomaLog.somar(-2, -3);
        assertEquals(-5, resultado, "A soma de negativos falhou");
    }
}
