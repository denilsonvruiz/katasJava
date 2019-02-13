package test.com.cenfotec.katas.cdh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cenfotec.katas.cdh.CalculadoraHileras;

public class TestCalculadoraHileras {
	
	@Test
	public void testAddMethod() {
		String numeros = "2;2;4;2";
		int resultado = CalculadoraHileras.Add(numeros);
		assertEquals(10, resultado, "Number should be 10");
	}

}
