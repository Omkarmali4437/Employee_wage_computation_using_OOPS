public class empwage {
	public void dailywage(){
		int ispresent=1;
		int isfulltime=1,isparttime=0,empwage,emphour,dailywage=20;

   	int attendence = (int)Math.floor(Math.random() * 10)%2;

		if (attendence == ispresent)
		{
			System.out.println("Employee is present");
			int empcheck = (int)Math.floor(Math.random() * 10)%2;
			if(empcheck == isfulltime)
			{
				System.out.println("Employee is full time");
				emphour=8;
				empwage=dailywage*emphour;
				System.out.println("Daily employee wage is: "+empwage);
			}
			else if(empcheck == isparttime)
			{
				System.out.println("Employee is part time");
				emphour=4;
				empwage=dailywage*emphour;
				System.out.println("Daily employee wage is: "+empwage);
			}
		}
		else
		{
     		System.out.println("Employee is absent");
			emphour=0;
			empwage=dailywage*emphour;
			System.out.println("Daily employee wage is: "+empwage);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		empwage ew=new empwage();
		ew.dailywage();
	}
}
