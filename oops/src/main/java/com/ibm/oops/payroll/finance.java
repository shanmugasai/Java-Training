package com.ibm.oops.payroll;

public class finance {
	public void processPay(Employee employee) {
		employee.netpay();
		if(employee instanceof PermanetEmployee) {
			PermanetEmployee permanetEmployee = (PermanetEmployee) employee;
			permanetEmployee.transportation();
			
		}
	}
}
