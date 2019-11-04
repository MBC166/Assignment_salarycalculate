package com.weltec.IT7320.assignment3.SalaryCalculator;

/**
 * @author Administrator
 *
 */

public class SalaryCalculatorImpl implements ISalaryCalculator {
	private ISalaryCalculator obj=null;

	public double computeTax(double income) {
		System.out.println("tax3:"+income);
		return 3;
	}

	public double weeklySalary(Employee income) {
		return obj.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		return obj.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee income) {
		return obj.computeKiwiSaver(income);
	}

	public void setObj(ISalaryCalculator obj) {
		this.obj = obj;
	}
	

}
