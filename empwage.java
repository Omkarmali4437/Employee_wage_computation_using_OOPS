public class empwage {
	public static final int isfulltime=1,isparttime=2,absent=0;
	public void dailywage(){
		int empwage,emphour=0,dailywage=20;

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
		System.out.println("Daily wage of an Employee is: "+empwage);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		empwage ew=new empwage();
		ew.dailywage();
	}
}
