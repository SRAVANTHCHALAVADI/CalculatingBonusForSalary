package com.epam.task;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PartTimeSalaryTest {
	private double inp;
	private double out;
	private PartTimeSalary gsf;
	@Before
	public void run() {
		gsf=new PartTimeSalary();
		
	}
	public PartTimeSalaryTest(double inp,double out) {
		this.inp=inp;
		this.out=out;
	}
	@Parameterized.Parameters
	public static Collection me() {
		return Arrays.asList(new Object [][] {
			{10000.0,500.00},{20000.0,1000.00}
		});
	}
	@Test
	public void test2() {
		assertEquals(out,gsf.salaryCalculation(inp),0);	}
}
