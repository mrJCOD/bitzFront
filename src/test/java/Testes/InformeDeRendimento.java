package Testes;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class InformeDeRendimento extends Metodos {

	@Before
	public void setUp() throws Exception {
		iniciarDeviceBitz("Informe de Rendimentos");
		logarNoApp();
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void ValidarElementosInformeDeRendimentos() {

		clicar(By.id("br.com.carson.android.bitz.hml:id/ibMenu"));
		clicar(By.id("br.com.carson.android.bitz.hml:id/group_income_report"));
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/tvToolbarTitle"), "Informe de rendimentos");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/edit_text"),
				"Baixe seu informe de rendimentos do último período:");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/tv_year_referenceTitle"), "Ano referência");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/tv_year_reference_subtitle"), "2021");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/tv_download"), "Baixar");
		assertTrue(driver.findElement(By.id("br.com.carson.android.bitz.hml:id/iv_right_arrow")).isDisplayed());
		assertTrue(driver.findElement(By.id("br.com.carson.android.bitz.hml:id/ibHelper")).isDisplayed());
		assertTrue(driver.findElement(By.id("br.com.carson.android.bitz.hml:id/ibBack")).isDisplayed());

	}

	@Test
	public void validandoElementosMsgAvisoInformeDeRendimentos() {

		clicar(By.id("br.com.carson.android.bitz.hml:id/ibMenu"));
		clicar(By.id("br.com.carson.android.bitz.hml:id/group_income_report"));
		clicar(By.id("br.com.carson.android.bitz.hml:id/tv_year_reference_subtitle"));
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/errorDialogTitle"), "Documento não disponível");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/errorDialogDescription"),
				"Você é novo por aqui. Não há documento referente à 2021 para você fazer o download.");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/errorDialogPrimaryBtn"), "Voltar para a Home");
		assertTrue(driver.findElement(By.id("br.com.carson.android.bitz.hml:id/errorDialogCloseBtn")).isDisplayed());

	}

}
