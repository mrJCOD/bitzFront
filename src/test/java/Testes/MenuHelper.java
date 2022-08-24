package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class MenuHelper extends Metodos {

	@Before
	public void setUp() throws Exception {
		iniciarDeviceBitz("Validar Menu Helper");
		logarNoApp();
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void test() {

		clicar(By.id("br.com.carson.android.bitz.hml:id/ibHelper"));
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/editText"), "Central de Ajuda");
		validarElementoVisivel(By.id("br.com.carson.android.bitz.hml:id/btSchedule"));
		validarElementoVisivel(By.id("br.com.carson.android.bitz.hml:id/btWhatsApp"));
		validarElementoVisivel(By.id("br.com.carson.android.bitz.hml:id/etFetchQuestions"));
		validarElementoVisivel(By.id("br.com.carson.android.bitz.hml:id/clItem"));

	}

}
