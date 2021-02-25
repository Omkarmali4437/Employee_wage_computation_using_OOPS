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

public class Empwage
{
	public static final int isfulltime=1,isparttime=2,absent=0;
	private int numofcompany=0;
	private CompanyEmpwage[] companyEmpwageArray;

	public Empwage()
	{
		companyEmpwageArray =new CompanyEmpwage[5];
	}

	public void addCompanyEmpwage(String company,int maximum_hrs,int maximum_days,int dailywage)
	{
		companyEmpwageArray[numofcompany]=new CompanyEmpwage(company,maximum_hrs,maximum_days,dailywage);
		numofcompany++;
	}
	public void computeEmpwage()
	{
		for(int i = 0; i<numofcompany; i++)
		{
			companyEmpwageArray[i].setTotalEmpwage(this.computeEmpwage(companyEmpwageArray[i]));
			System.out.println(companyEmpwageArray[i]);
		}
	}
	private int computeEmpwage(CompanyEmpwage companyEmpwage)
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
