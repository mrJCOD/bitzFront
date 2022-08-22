package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class CancelamentoDeConta extends Metodos {

	@Before
	public void setUp() throws Exception {
		iniciarDeviceBitz("Cancelamento De Conta");
		logarNoApp();
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void test() {

		clicar(By.id("br.com.carson.android.bitz.hml:id/ibMenu"));
		clicar(By.id("br.com.carson.android.bitz.hml:id/groupProfile"));
		swipeUp();
		clicar(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]"));
		validarTexto(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]"), "Tem certeza que deseja encerrar sua conta no Bitz?");
		validarTexto(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]"),
				"No Bitz a sua conta é grátis. \n" + 
				" Que tal pensar por mais tempo? \n" + 
				" Mas se ainda quiser encerrar a conta, é importante lembrar que você não poderá reabrir uma nova conta Bitz no futuro.");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/btContinue"), "Encerrar conta permanentemente");
		validarTexto(By.id("br.com.carson.android.bitz.hml:id/btGoToHome"), "Manter minha conta grátis");
		

	}

}
