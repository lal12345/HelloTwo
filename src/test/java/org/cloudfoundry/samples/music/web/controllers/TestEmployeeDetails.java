package org.cloudfoundry.samples.music.web.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails();

   //test to check appraisal
   //
   @Test
   public void testCalculateAppriasal() {
	   System.out.println("new gradle");
	   System.out.println("new lal's changes");
	   System.out.println("new lal's changes2");
	   System.out.println("new_gradle_change2");
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      assertEquals(500, appraisal, 0.0);
      System.out.println("assertEquals");
      System.out.println("assertNOtEquals");
      System.out.println("new_gradle_change2");
      System.out.println("new_gradle_change3");
      System.out.println("new_gradle_change");
      System.out.println("new_gradle_change4");
      System.out.println("new_gradle_change5");
      System.out.println("new_gradle_change6");
      System.out.println("Rajeev4....");
      System.out.println("new_gradle_change7");
      System.out.println("new_gradle_change8");
      System.out.println("Rajeev5....");
      System.out.println("new_gradle_change9");

      //hgfd

      System.out.println("new_gradle_change10");

   }

   // test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
	   System.out.println("new lal's changes");
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double salary = empBusinessLogic.calculateYearlySalary(employee);
      assertEquals(96000, salary, 0.0);
      System.out.println("Rajeev");
      System.out.println("Rajeev1....new");
      System.out.println("Rajeev2....");
      System.out.println("Rajeev2....new");
      System.out.println("Rajeev3....new");
   }
}