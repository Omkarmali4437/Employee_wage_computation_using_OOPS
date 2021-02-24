public class empwage {
	public static final int isfulltime=1,isparttime=2,absent=0;
	public static int day=1;
	public static int maximum_days=20,maximum_hrs=100,dailywage=20;
	public static int total_hrs=0,total_days=0,totalwage=0;

	public static int wagelimit(){
		int emphour=0;
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
		return emphour;
	}
	public void salary()
	{
		empwage emp=new empwage();
		while(total_hrs<=maximum_hrs && total_days<=maximum_days)
      {
			int empwage;
			total_hrs++;
			int emphr=wagelimit();
         empwage=emphr*dailywage;
         System.out.println(empwage);
			total_hrs+=emphr;
		}
		totalwage=total_hrs*dailywage;
		System.out.println("Total wage of an Employee is: "+totalwage);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		empwage ew=new empwage();
		ew.salary();
	}
}
