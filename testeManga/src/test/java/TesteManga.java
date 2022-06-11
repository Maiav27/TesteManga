import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteManga {
    @Test
    public void abrirPaginaInicial(){
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\Adelmo\\IdeaProjects\\testeManga\\src\\test\\resources\\chromedriver_win32\\chromedriver.exe" );
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://mangalivre.net");
        Assertions.assertEquals("https://mangalivre.net/", webDriver.getCurrentUrl());
    }

}
