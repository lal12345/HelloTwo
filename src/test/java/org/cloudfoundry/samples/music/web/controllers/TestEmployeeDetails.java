package org.cloudfoundry.samples.music.web.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails();

   //test to check appraisal
   @Test
   public void testCalculateAppriasal() {
	   System.out.println("new gradle");
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      assertEquals(500, appraisal, 0.0);
      System.out.println("assertEquals");
      
   }

   // test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double salary = empBusinessLogic.calculateYearlySalary(employee);
      assertEquals(96000, salary, 0.0);
   }
}