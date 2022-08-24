package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class IndiqueEGanhe extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarDeviceBitz("Indique e ganhe");
		logarNoApp();

	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() {

		clicar(By.id("br.com.carson.android.bitz.hml:id/ibMenu"));
		clicar(By.id("br.com.carson.android.bitz.hml:id/groupMemberGetMember"));
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/btKnowMore"), "Saiba como funciona");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/btInviteFriends"), "Indicar amigo");

	}

}
