package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSetup {
    private static final String BROWSER_PROPERTY = "browser";

    private static final String DEFAULT_BROWSER = "chrome";
    private static final ChromeOptions options = new ChromeOptions();

    public static WebDriver browserDriverSetUp() {
        WebDriver driver = null;
        String browserType = getBrowserType();
        options.addArguments("--remote-allow-origins=*");
        switch (browserType) {
            case "yandex":
                System.setProperty("webdriver.chrome.driver", "/Users/maksim.chubura/WebDriver/bin/yandexdriver.exe");
                driver = new ChromeDriver(options);
                break;
            case "chrome":
                driver = new ChromeDriver(options);
                break;
            default:
                throw new IllegalArgumentException("Invalid browser type: " + browserType);
        }
        return driver;
    }

    private static String getBrowserType() {
        // Проверяем наличие системной проперти или переменной окружения для выбора браузера
        String browserType = System.getProperty(BROWSER_PROPERTY);
        if (browserType == null) {
            browserType = System.getenv(BROWSER_PROPERTY);
        }
        if (browserType == null) {
            // Если системная проперти или переменная окружения не указаны, используем значение по умолчанию
            browserType = DEFAULT_BROWSER;
        }
        return browserType.toLowerCase(); // возвращаем значение в нижнем регистре
    }
}
