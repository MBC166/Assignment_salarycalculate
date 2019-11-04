package com.weltec.IT7320.assignment3.SalaryCalculator;

public interface ISalaryCalculator {
	public double	computeTax(double income);
	public double	weeklySalary(Employee income);
	public double	fortnightSalary(Employee income);
	public double	computeKiwiSaver(Employee income);
	
	

}
