package com.test.utils;
import java.util.ArrayList;
import com.test.utils.Excelops;
public class Getexceldata {
	static Excelops excel;
	
	  public static ArrayList<Object[]>fetchdata()
	  
	  {
		 ArrayList<Object[]> data= new ArrayList<Object[]>();
		     
		    try {
		          excel = new Excelops("D:\\Automation\\Workspace\\maventestseleniumpro\\src\\main\\java\\com\\testdata\\Logindata.xlsx");
		      }
		    
		     catch(Exception e) {
		      
			     e.printStackTrace();
		      }
		    
			int sheetIndex = 2; 
			for(int row=2; row<=excel.rowcount(sheetIndex);row++)
			{
			    
				String firstname = excel.getData(sheetIndex, row, "Firstname");
				String lastname = excel.getData(sheetIndex, row, "Lastname");
				String username = excel.getData(sheetIndex, row, "Username");
				String pass = excel.getData(sheetIndex, row, "Password");
				String confirmpass = excel.getData(sheetIndex, row, "Confirmpassword"); 	
				
				Object[] object = {firstname,lastname,username,pass,confirmpass};
				
				data.add(object); 
	       }
       return data; 
    }
 }