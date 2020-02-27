package com.epam.task;

public class FullTimeSalary extends CalculateSalary {

	@Override
	double salaryCalculation(double salary) {
		return 0.4*salary;
	}

}
