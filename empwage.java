import java.util.*;

interface ImplementComputeEmpWage {
	public void addCompanyEmpwage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs);
	public void computeEmpwage();

}

class CompanyEmpwage {

	public final String company;
	public final int maximum_hrs;
	public final int maximum_days;
	public final int dailywage;
	public int totalwage;

	public CompanyEmpwage(String company,int maximum_hrs,int maximum_days,int dailywage)
	{
		this.company = company;
		this.maximum_hrs = maximum_hrs;
		this.maximum_days = maximum_days;
		this.dailywage=dailywage;
	}
	public void setTotalEmpwage(int totalwage)
	{
		this.totalwage=totalwage;
	}
	public String toString()
	{
		return "Total employee wage for company: " +company+" is: "+totalwage;
	}
}


public class Empwage implements ImplementComputeEmpWage
{
	public static final int isfulltime=1,isparttime=2,absent=0;

	private ArrayList<CompanyEmpwage> companyEmpwageList;

	public Empwage()
	{
		companyEmpwageList =new ArrayList<>();
	}

	public void addCompanyEmpwage(String company,int maximum_hrs,int maximum_days,int dailywage)
	{
		CompanyEmpwage companyEmpwage=new CompanyEmpwage(company,maximum_hrs,maximum_days,dailywage);
		companyEmpwageList.add(companyEmpwage);
	}
	public void computeEmpwage()
	{
		for(int i = 0; i<companyEmpwageList.size(); i++)
		{
			CompanyEmpwage companyEmpwage = companyEmpwageList.get(i);
			companyEmpwage.setTotalEmpwage(this.computeEmpwage(companyEmpwage));
			System.out.println(companyEmpwage);
		}
	}
	public int computeEmpwage(CompanyEmpwage companyEmpwage)
	{
		int emphour=0,total_hrs=0,total_days=0,empwage=0;
		while(total_hrs<=companyEmpwage.maximum_hrs && total_days<companyEmpwage.maximum_days)
      {
			total_days++;
			int attendence = (int)Math.floor(Math.random() * 10)%3;
			switch (attendence){
				case isfulltime:
					System.out.println("Employee is Full Time");
					emphour=8;
					break;
				case isparttime:
					System.out.println("Emplpyee is Part Time");
					emphour=4;
					break;
				case absent:
					System.out.println("Employee is Absent");
					emphour=0;
					break;
			}
			empwage=emphour*companyEmpwage.dailywage;
			total_hrs+=emphour;
			System.out.println("Day: "+total_days+" Employee hours: "+emphour);
		}
		return total_hrs*companyEmpwage.dailywage;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		Empwage empwage =new Empwage();
		empwage.addCompanyEmpwage("Dmart",20,40,60);
		empwage.addCompanyEmpwage("Reliance",30,20,40);

		empwage.computeEmpwage();

	}
}
