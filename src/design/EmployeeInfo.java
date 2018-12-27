package design;

import java.util.Scanner;

public  class EmployeeInfo extends  EmployeePro{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */



	static String companyName;

	public static int Salary =0;
	public static int years = 0;
	public int empAge;
	private String countryName= "USA";
	String name;

	public EmployeeInfo(){}

	public EmployeeInfo(int age){
		this.empAge=age;
		System.out.println(age);
	}

	public EmployeeInfo(String name, int age){
		super();
		this.empAge=age;
		this.name=name;
		System.out.println(name+" "+age);
	}





	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */






	public String getCountryName() {
		return countryName;

	}

	//public void setCountryName(String countryName) {
		//this.countryName = countryName;
	//}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 * 
	 */
	public static double calculateEmployeeBonus(int salary, int performance) {
		double total = 0;
		if (performance >= 8)
			total = salary+salary * .1;
		else {
			total = salary+salary * .08;
		}
		System.out.println("bonus" + total);
		return total;

	}
	public void worktime() {
		System.out.println("Employees should work 8 hours monday to thursday");}


	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension
		try {
			EmployeeInfo.years = Integer.parseInt(convertedTodaysDate.substring(convertedTodaysDate.indexOf('/')+1,convertedTodaysDate.length()))- Integer.parseInt(convertedJoiningDate.substring(convertedJoiningDate.indexOf('/')+1,convertedJoiningDate.length()));
			if (EmployeeInfo.years < 1){
				System.out.println("who worked more than a year get pension");
				return 0;
			}

		}catch (Exception e){
			System.out.println("there was an error");
		}

		//Calculate pension
		double pension = .05;
		for(int i = 0; i< EmployeeInfo.years;i++){
			pension += .05;
		}
		total = (int) (Salary*  pension);
		System.out.println("Pension: "+total);

		return total;


	}

	@Override
	public int calculateSalary() {
		return 0;
	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
