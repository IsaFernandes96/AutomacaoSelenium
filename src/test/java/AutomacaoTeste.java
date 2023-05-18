import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class AutomacaoTeste {

    private WebDriver navegar;

    @Test
public void pesquisarGoogleSiteNtt() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://www.google.com.br/ ");
        navegar.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Nttdata", Keys.ENTER);
        navegar.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[2]/span[1]/span[2]/span[2]/span")).click();
        navegar.findElement(By.xpath("//*[@id=\"all\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"menu-item-32094\"]/a/span")).click();
        navegar.findElement(By.xpath("//a[normalize-space()='Junte-se a nossa equipe']")).click();
        ArrayList<String> handles = new ArrayList<>(navegar.getWindowHandles());
        navegar.switchTo().window(handles.get(1));
        try { Thread.sleep(3000); } catch (Exception e) { e.printStackTrace(); }
        navegar.findElement(By.id("pesquisar-vaga-localidade-etc")).click();
        navegar.findElement(By.id("pesquisar-vaga-localidade-etc")).sendKeys("Arquiteto", Keys.ENTER);
        try { Thread.sleep(3000); } catch (Exception e) { e.printStackTrace(); }
        navegar.quit();


    }
}
