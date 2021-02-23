public class empwage {
	public static final int isfulltime=1,isparttime=2,absent=0;
	public void wagelimit(){
		int maximum_days=20,maximum_hrs=100,dailywage=20;
		int total_hrs=0,total_days=0,totalwage=0;
		while(total_hrs<=maximum_hrs && total_days<=maximum_days)
		{
			total_days++;
			int empwage,emphour=0;

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
			total_hrs+=emphour;
			empwage=emphour*dailywage;
			System.out.println(empwage);
			//totalwage+=empwage;
		}
		totalwage=total_hrs*dailywage;
		System.out.println("Daily wage of an Employee is: "+totalwage);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		empwage ew=new empwage();
		ew.wagelimit();
	}
}
