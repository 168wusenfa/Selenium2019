package ch06;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public BaseTest() {
		System.out.println("BaseTest-���췽��");
	}
	
	//��ʼ������������������������ݿ�
		@BeforeClass
		public void bc() {
			
			System.out.println("*********@BeforeClass********");
		}
		
		//���������ر���������Ͽ����ݿ�����
		@AfterClass
		public void ac() {
			System.out.println("*********@AfterClass********");
		}

}
