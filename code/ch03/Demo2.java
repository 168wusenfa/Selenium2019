package ch03;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
//	System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

	WebDriver wd =new FirefoxDriver();
	wd.manage().window().maximize();
//	����������ĳߴ�
//	Dimension size=new Dimension(300, 400);
//	wd.manage().window().setSize(size);
	
//	wd.get("http://www.baidu.com/"); ����������ķ�ʽ
	wd.navigate().to("http://www.baidu.com/");
	Thread.sleep(3000);
//	System.out.println(	wd.getCurrentUrl());
//	System.out.println(wd.getTitle());

	boolean flag=wd.getPageSource().contains("����");
	if(flag) {
		System.out.println("success");
	}else {
		System.out.println("fail");
	}
	
//	wd.get("http://localhost:8032/Mymovie/admin.php/Login/index.html/");
//	Thread.sleep(3000);
//	wd.navigate().back();
//	wd.navigate().forward();
//	wd.navigate().refresh();
	
//	wd.close();//ֻ�ǹرյ�ǰҳ�棬����geckodriver�Ľ���
	wd.quit();//���׹ر��������geckodriver�Ľ��̹رգ��ͷ���Դ
}
}
