package com.epam.task;

public class GetSalaryFactory {
	public static CalculateSalary getPlan(String salaryType){  
       GetSalaryFactory g=new GetSalaryFactory();
      if(salaryType.equalsIgnoreCase("FULLTIME")) {  
             return new FullTimeSalary();  
           }   
       else if(salaryType.equalsIgnoreCase("PARTTIME")){  
            return new PartTimeSalary();  
        }   
      
  return null;  
}  
}
