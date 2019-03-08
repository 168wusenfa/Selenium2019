package ch04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
//		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

		WebDriver wd = new FirefoxDriver();
		wd.get("file:///D:/upupw32/htdocs/test/table.html");

//		WebElement table=wd.findElement(By.id("table1"));����
		// �ҵ�table
		WebElement table = wd.findElement(By.xpath("//table"));
		// ����������
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("�����ǣ�" + rows.size());

		for (WebElement r : rows) {
			// ��ȡÿһ�е�������
			List<WebElement> colls = r.findElements(By.tagName("td"));
			// ����ÿ����Ԫ��
			for (WebElement c : colls) {
				System.out.print(c.getText()+" ");
			}
			System.out.println();

		}
		
		
		WebElement result=wd.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println(result.getText());
		
		
		WebElement c=wd.findElement(By.xpath("//td[contains(text(),'�����еڶ�')]/input[2]"));
		c.click();
		
		Thread.sleep(5000);
		wd.quit();

	}
}
