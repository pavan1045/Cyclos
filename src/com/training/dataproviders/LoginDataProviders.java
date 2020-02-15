package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[12]; 
			obj[0] = temp.getloginName(); 
			obj[1] = temp.getfullName(); 
			obj[2] = temp.getEmail(); 

			obj[3] = temp.getAddress(); 

			obj[4] = temp.getpostalCode(); 

			obj[5] = temp.getcity(); 

			obj[6] = temp.getphone(); 

			obj[7] = temp.getmobilePhone(); 

			obj[8] = temp.getfax(); 

			obj[9] = temp.geturl(); 

			obj[10] = temp.getpassword(); 

			obj[11] = temp.getconfirmPassword(); 

			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:/Users/Naveen/Desktop/Testing.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name="Excel")
	public Object[][] getExcelContent()
	{
		String FileName="C:\\Users\\IBM\\Desktop\\project\\Excel.xlsx";
		return new ApachePOIExcelRead().getExcelContent(FileName);
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}
