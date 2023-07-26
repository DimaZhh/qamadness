package animals;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.Selenide.open;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTests {

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("--disable-gpu");
//        options.addArguments("enable-automation");
//        options.addArguments("--headless");
//        options.addArguments("--window-size=1920,1080");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--dns-prefetch-disable");
//        options.setPageLoadStrategy(PageLoadStrategy.NONE);
//
//        Configuration.browserCapabilities = options;
//        Configuration.browserSize = "1920x1080";
//        Configuration.timeout = 15000;
//        Configuration.headless = false;

        open("https://google.com/");
    }

    @Test
    public void testLucky() {

        Cat cat = new Cat("name", 12);

        assertEquals("say may", cat.yourVoiceForTests());
    }
}
