package ch0402;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrontLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/Mymovie/index.php/Index/index.html");

		driver.findElement(By.linkText("��¼")).click();

		driver.findElement(By.name("username")).sendKeys("qingdao01");
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='���ϵ�¼']")).click();

		for (int i = 0; i < 5; i++) {
			driver.get("http://localhost:8032/Mymovie/index.php/Detail/index/id/38");
			driver.findElement(By.xpath("//button[contains(text(),'дӰ��')]")).click();
			driver.findElement(By.name("title")).sendKeys("hello0311");
			driver.switchTo().frame("xhe0_iframe");
//			������ҳ�����ҳ���Ԫ�ؾ��Ҳ�����
//			System.out.println(driver.findElement(By.name("title")).isEnabled());
			driver.findElement(By.tagName("body")).click();
			// �л�����λ��
			driver.findElement(By.tagName("body")).sendKeys("�����Ӱ�����Ƽ���");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@value='����Ӱ��']")).click();

		}

	}
}
