package ch05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/Mymovie/");
		
		try {
//			boolean flag=driver.findElement(By.linkText("��¼")).isSelected();
//			System.out.println(flag);
			
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			String title=(String) js.executeScript("return document.title");
//			System.out.println(title);
			
			//�������click�¼���Чʱ
			WebElement login_link=driver.findElement(By.linkText("��¼"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",login_link);
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			
			//����
			System.out.println("Ԫ�ز�����");
		}finally {
			if (driver !=null) {
				driver.quit();
			}
		}
		

	}

}
