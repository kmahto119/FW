package com.contact.test1;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.genericLib.FileLib;

public class SameClassDataProvider {

	 @Test(dataProvider = "getDataCart")
	    public void addToCart(String data) {
	        System.out.println("Data is: " + data);
	    }
	 
	 
	 
	@DataProvider(name = "getDataCart")
    public Object[][] dataProviderMethod() throws IOException, Throwable
	{
		FileLib flib=new FileLib();
		int rowCount = flib.getRowCount("sheet2");
		for (int i = 0; i < rowCount; i++) {
			String excelData = flib.getExcelData("Sheet2", i, 0);
			String excelData2 = flib.getExcelData("Sheet2", i, 1);
			
			
			
		}
        return new Object[][] { { "Kamlshwar Mahto" }, { "Pappu Mahto" } };
    }
 
   
}
