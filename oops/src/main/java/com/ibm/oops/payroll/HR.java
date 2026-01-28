package com.ibm.oops.payroll;

public class HR {

	public static Employee recruitIntern(String empType) {
		if(empType.equalsIgnoreCase("I")) {
			Intern intern= new Intern();
			return intern;
		}else if(empType.equalsIgnoreCase("p")) {
			return new PermanetEmployee();
		}
		return null;
	}

}
