package com.ibm.oops;


import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.Finance;
import com.ibm.oops.payroll.HR;
import com.ibm.oops.payroll.Intern;
import com.ibm.oops.payroll.PermanetEmployee;



public class Application
{
	public static void main( String[] args )
	{
		
		Finance finance = new Finance();
		Employee employee HR.recruit("p");
		if (employee != null) {
			finance.processPay(employee);
		 }
		employee = HR.recruit("I");
		if (employee != null) {
			finance.processPay(employee);
		}
		employee =HR.recruitIntern("F");
		if(employee != null) {
			finance.processPay(employee);
		}
		
		
	}
}