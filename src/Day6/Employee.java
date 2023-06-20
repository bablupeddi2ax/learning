package Day6;

public class Employee extends Person {
	static double annualSalary;
    static int startYear;
    static String insuranceNo;
    Employee(String n, double d, int s, String i) {
        super(n);
        annualSalary = d;
        startYear = s;
        insuranceNo = i;
    }
    public static void getAnnualSalary() {
        System.out.println(annualSalary);
    }
    public static void getStartYear() {
        System.out.println(startYear);
    }
    public static void getInsuranceNo() {
        System.out.println(insuranceNo);
    }
}
