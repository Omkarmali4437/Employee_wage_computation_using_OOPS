public class empwage {
	public void dailywage(){
		int ispresent=1,empwage,emphour,dailywage=20;

   	int empcheck = (int)Math.floor(Math.random() * 10)%2;

   	if (empcheck == ispresent)
		{
      	System.out.println("Employee is present");
			emphour=8;
			empwage=dailywage*emphour;
			System.out.println("Daily employee wage is: "+empwage);
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
