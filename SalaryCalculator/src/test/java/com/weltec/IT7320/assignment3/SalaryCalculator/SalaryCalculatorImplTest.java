package com.weltec.IT7320.assignment3.SalaryCalculator;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class SalaryCalculatorImplTest {
	private ISalaryCalculator iSalaryCalculator;
	private SalaryCalculatorImpl salaryCalculatorImpl;
	private Employee employee;
	double income, tax, ecpected;

	@Before
	public void setUp() throws Exception {

		salaryCalculatorImpl = new SalaryCalculatorImpl();
		
		//Mockito.when(iSalaryCalculator.computeTax(income)).thenCallRealMethod();
		/*
		 * Using Mockito to .....
		 */
	}
	private void mock(double income) {
		iSalaryCalculator = Mockito.mock(ISalaryCalculator.class);
		if (income>70000) {
			Mockito.when(iSalaryCalculator.computeTax(income)).thenReturn((double) income * 0.33);
			}else if (income<=70000&&income>48000){
				Mockito.when(iSalaryCalculator.computeTax(income)).thenReturn((double) income * 0.30);
			}else if (income<=48000&&income>14000){
				Mockito.when(iSalaryCalculator.computeTax(income)).thenReturn((double) income * 0.175);
			}else if(income<=14000){
				Mockito.when(iSalaryCalculator.computeTax(income)).thenReturn((double) income * 0.105);
			}else {
				System.out.println("impassable");
			}
		salaryCalculatorImpl.setObj(iSalaryCalculator);
 		tax = iSalaryCalculator.computeTax(income);
	}

	@Test
	public final void testComputeTax() {
		income = 100000;
		ecpected=33000;
		mock(income) ;
		System.out.println(income+"   "+tax);
		assertEquals(ecpected, iSalaryCalculator.computeTax(income), 0.001);
	/*--------------------------------------------------------------------------------*/	
		income = 50000;
		ecpected=15000;
		mock(income) ;
		System.out.println(income+"   "+tax);
		assertEquals(ecpected, iSalaryCalculator.computeTax(income), 0.001);
		
		/*--------------------------------------------------------------------------------*/	
		income = 20000;
		ecpected=3500;
		mock(income) ;
		System.out.println(income+"   "+tax);
		assertEquals(ecpected, iSalaryCalculator.computeTax(income), 0.001);
		
		/*--------------------------------------------------------------------------------*/	
		income = 10000;
		ecpected=1050;
		mock(income) ;
		System.out.println(income+"   "+tax);
		assertEquals(ecpected, iSalaryCalculator.computeTax(income), 0.001);
		 
	}

//	
//
//	@Test
//	public final void testWeeklySalary() {
//	}
//
//	@Test
//	public final void testFortnightSalary() {
//	}
//
//	@Test
//	public final void testComputeKiwiSaver() {
//	}
//
//	@Test
//	public final void testSetObj() {
//	}

	@After
	public void tearDown() throws Exception {
	}

}
