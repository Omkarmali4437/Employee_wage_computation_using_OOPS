public class empwage {
	public void attendence(){
		int ispresent=1;

   	int empcheck = (int)Math.floor(Math.random() * 10)%2;

   	if (empcheck == ispresent)
      	System.out.println("Employee is present");
   	else
     		System.out.println("Employee is absent");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem using OOPS concept");
		empwage ep=new empwage();
		ep.attendence();
	}
}
