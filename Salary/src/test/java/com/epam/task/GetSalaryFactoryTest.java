package com.epam.task;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GetSalaryFactoryTest {
	private double inp;
	private double out;
	private FullTimeSalary gsf;
	@Before
	public void run() {
		gsf=new FullTimeSalary();
		
	}
	public GetSalaryFactoryTest(double inp,double out) {
		this.inp=inp;
		this.out=out;
	}
	@Parameterized.Parameters
	public static Collection me() {
		return Arrays.asList(new Object [][] {
			{10000.0,4000.00},{20000.0,8000.00}
		});
	}
	@Test
	public void test2() {
	assertEquals(out,gsf.salaryCalculation(inp),0);
	}

	@Test
	public void test() {
		CalculateSalary partTime= GetSalaryFactory.getPlan("PARTTIME");
		assertEquals(500.00,partTime.salaryCalculation(10000.0),0);
	}
	@Test
	public void test11() {
		CalculateSalary fullTime= GetSalaryFactory.getPlan("FULLTIME");
		assertEquals(4000.00,fullTime.salaryCalculation(10000.0),0);
	}
	@Test
	public void test1() {
		CalculateSalary fullTime1= GetSalaryFactory.getPlan("");
		assertNull(fullTime1);
	}

}
