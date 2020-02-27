package com.epam.task;

public class PartTimeSalary extends CalculateSalary {

	@Override
	double salaryCalculation(double salary) {
		return 0.05*salary;
	}

}
