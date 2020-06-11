package homework_test.hw1;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class VKcom {
    private WebDriver driver = new ChromeDriver();
    private static String EMAIL_USERNAME;
    private static String EMAIL_PASSWORD;

    @BeforeClass
    public void setUpData() {
        EMAIL_USERNAME = "...";
        EMAIL_PASSWORD = "...";

        driver.manage().window().maximize();
        driver.get("https://vk.com");
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"index_email\"]")));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"index_email\"]"));
        username.sendKeys(EMAIL_USERNAME);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"index_pass\"]")));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"index_pass\"]"));
        password.sendKeys(EMAIL_PASSWORD);
        WebElement inputBtn = driver.findElement(By.xpath("//*[@id=\"index_login_button\"]"));
        inputBtn.click();

        System.out.println("User is logged in");
    }

    @Test
    public void Message() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Сообщения']")));
        WebElement mesBtn = driver.findElement(By.xpath("//span[text()='Сообщения']"));
        mesBtn.click();

        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='_im_dialog_link']")));
        WebElement openDialog = driver.findElement(By.xpath("//span[@class='_im_dialog_link']"));
        openDialog.click();

        WebDriverWait webDriverWait1 = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("im_editable0")));
        WebElement messageString = driver.findElement(By.id("im_editable0"));
        messageString.click();
        messageString.sendKeys("Сообщение отправлено автоматизированным ПО");

        WebDriverWait webDriverWait3 = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"im-send-btn im-chat-input--send _im_send im-send-btn_send\"]")));
        WebElement sendMes = driver.findElement(By.xpath("//button[@class=\"im-send-btn im-chat-input--send _im_send im-send-btn_send\"]"));
        sendMes.click();

        WebDriverWait webDriverWait4 = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"im-mess--text wall_module _im_log_body\"]")));
        WebElement newMes = driver.findElement(By.xpath("//div[@class=\"im-mess--text wall_module _im_log_body\"]"));
        System.out.println("Your message was sent");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}