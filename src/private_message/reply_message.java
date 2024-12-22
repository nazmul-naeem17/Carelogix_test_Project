package private_message;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reply_message {

    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the login page
            driver.get("https://hachnat.stage-carelogix.de/sing-in/");
            driver.manage().window().maximize();

            // Step 1: Log in
            WebElement username = driver.findElement(By.id("credential"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.className("ant-btn-primary"));

            username.sendKeys("nh.naeem786786@gmail.com");
            password.sendKeys("Carelogix24!!");
            loginButton.click();

            Thread.sleep(15000);

            // Step 2: Select the chat contact (Robart Bruce)
            WebElement contact = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[1]/div[2]/div/div/div[1]/div[1]"));
            contact.click();
            Thread.sleep(15000);
            // Step 3: Locate the message to reply to
//            WebElement messageToReply = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[2]/section/div/div/div[2]/div[2]/div/div[6]/div[1]/div[1]/div[2]/div[2]"));
//            messageToReply.click();
//            Thread.sleep(5000);
//            // Step 4: Click the reply button
//            WebElement replyButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div/div[2]/section/div/div/div[2]/div[2]/div/div[6]/div[1]/div[2]/svg/path"));
//            replyButton.click();        
//            Thread.sleep(10000);
            // Step 5: Enter the reply message
            WebElement replyInput = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[2]/div[3]/section/div[2]/form/div/div/div/div/div/div/input"));
            replyInput.sendKeys("Welcome");
            // Step 6: Send the reply
            WebElement sendButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div/div[2]/div[3]/section/div[2]/form/button"));
            sendButton.click();
        }
             catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
            System.out.println("Test Failed due to an exception.");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
