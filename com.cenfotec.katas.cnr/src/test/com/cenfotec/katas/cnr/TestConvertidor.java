package test.com.cenfotec.katas.cnr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cenfotec.katas.cnr.Convertidor;

public class TestConvertidor {
	
	@Test
	public void testDiezUnidades() {
		assertEquals("I", Convertidor.Convertir(1), "Result should be I");
		assertEquals("II", Convertidor.Convertir(2), "Result should be II");
		assertEquals("III", Convertidor.Convertir(3), "Result should be III");
		assertEquals("IV", Convertidor.Convertir(4), "Result should be IV");
		assertEquals("V", Convertidor.Convertir(5), "Result should be V");
		assertEquals("VI", Convertidor.Convertir(6), "Result should be VI");
		assertEquals("VII", Convertidor.Convertir(7), "Result should be VII");
		assertEquals("VIII", Convertidor.Convertir(8), "Result should be VIII");
		assertEquals("IX", Convertidor.Convertir(9), "Result should be IX");
		assertEquals("X", Convertidor.Convertir(10), "Result should be X");

	}
	
	@Test
	public void testDosDigitos() {
		assertEquals("XIII", Convertidor.Convertir(13), "Result should be XIII");
	}
	
	@Test
	public void testTresDigitos() {
		assertEquals("CDLV", Convertidor.Convertir(455), "Result should be CDLV");
	}
	
	@Test
	public void testCuatroDigitos() {
		assertEquals("M", Convertidor.Convertir(1000), "Result should be M");
	}

}
