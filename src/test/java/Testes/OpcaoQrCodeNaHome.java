package Testes;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class OpcaoQrCodeNaHome extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarDeviceBitz("Validar Opcao de QrCode Na home");
		logarNoApp();
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void test() {

		boolean elementoOpcaoQrCode = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup"))
				.isDisplayed();
		assertTrue(elementoOpcaoQrCode);
		assertTrue(driver.findElement(By.id("br.com.carson.android.bitz.hml:id/ivQrCode")).isDisplayed());
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/tvTitle"), "Rede credenciada QR Code™ Pay");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/tvDescription"), "Pague e receba de forma fácil ;)");

	}

}
