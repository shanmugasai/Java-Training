package com.ibm.oops;
import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.PermanetEmployee;


import com.ibm.oops.payroll.Employee;

public class Application
{
	public static void main( String[] args )
	{
		Employee employee= new PermanetEmployee();

		employee.netpay();
	}
}