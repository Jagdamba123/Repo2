package testPackage;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomlogin.Pomhrm;
import testUtility.FetchData;

public class TestClass extends BaseClass {
	
	 Pomhrm log;
	 FetchData d;
	 @BeforeClass
	 public void beforeClass()
	 {
	 log=new Pomhrm(driver);
	 }
	
	 @Test
	 public void test() throws EncryptedDocumentException, IOException  
	 {
	
	 log.verifyForUsername(d.fetchDataFromExcel(0, 0));
	 log.verifyForPassword(d.fetchDataFromExcel(0, 1));
	 log.verifyForLogin();
	 }
	
	 @AfterClass
	 public void afterClass()
	 {
		 
	 }

}
