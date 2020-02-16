package ejercicio1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EjercicioScannerTest {

	private static final String LA_VARIABLE_A_ES_IGUAL_A_B = "La variable a es igual a b";
	private static final String LA_VARIABLE_A_ES_MENOR_A_B = "La variable a es menor a b";
	private static final String LA_VARIABLE_A_ES_MAYOR_A_B = "La variable A es mayor a B";

	EjercicioScanner ejercicioScanner;

	@Before
	public void init() {
		ejercicioScanner = new EjercicioScanner();
	}

	@Test
	public void aEsMayoraB() {

		// Arrange
		int a = 45;
		int b = 12;

		// Act
		String resultado = ejercicioScanner.validarSiAesMayorBB(a, b);

		// Assert
		Assert.assertEquals(LA_VARIABLE_A_ES_MAYOR_A_B, resultado);
	}

	@Test
	public void aEsMenorB() {

		// Arrange
		int a = 4;
		int b = 12;

		// Act
		String resultado = ejercicioScanner.validarSiAesMayorBB(a, b);

		// Assert
		Assert.assertEquals(LA_VARIABLE_A_ES_MENOR_A_B, resultado);
	}

	
	@Test
	public void aEsIgualB() {

		// Arrange
		int a = 28;
		int b = 28;

		// Act
		String resultado = ejercicioScanner.validarSiAesMayorBB(a, b);

		// Assert
		Assert.assertEquals(LA_VARIABLE_A_ES_IGUAL_A_B, resultado);
}

}
