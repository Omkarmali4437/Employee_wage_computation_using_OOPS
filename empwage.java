public class Empwage {
	public static final int isfulltime=1,isparttime=2,absent=0;

	private final String company;
	private final int maximum_hrs;
	private final int maximum_days;
	private final int dailywage;
	private int totalwage;

	public Empwage(String company,int maximum_hrs,int maximum_days,int dailywage)
	{
		this.company = company;
		this.maximum_hrs = maximum_hrs;
		this.maximum_days = maximum_days;
		this.dailywage=dailywage;
	}

	public void computeEmpwage()
	{
		int emphour=0,total_hrs=0,total_days=0,empwage=0;
		while(total_hrs<=maximum_hrs && total_days<maximum_days)
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
			empwage=emphour*dailywage;
			total_hrs+=emphour;
			System.out.println("Day: "+total_days+" Employee hours: "+emphour);
			System.out.println(empwage);
		}
		totalwage=total_hrs*dailywage;
		System.out.println("Total salary of an Employee working at "+company+" is: "+totalwage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		Empwage dMart =new Empwage("Dmart",100,20,20);
		Empwage reliance =new Empwage("Reliance",200,40,60);

		dMart.computeEmpwage();
		reliance.computeEmpwage();

	}
}
