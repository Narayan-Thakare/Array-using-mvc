package view;

import java.util.Scanner;

import controller.Controll;

public class View {
 
public  View()
 {
	 Controll c= new Controll();
	 Scanner s = new Scanner(System.in);
	 System.out.println("1.Add Student");
	 System.out.println("2.Show Student");
	 System.out.println("3.Search Student");
	 System.out.println("4.Delete Student");
	 System.out.println("5.Upadate Student");
	 System.out.println("Enetr the choice");
	 int n=Integer.parseInt(s.nextLine());
	 switch(n)
	 {
	 
	 case 1:
		c.addstudent();
		break;
		
	 case 2:
		 c.show();
		 break;
	 
	 
	 
	 }

	 
	 
	 
 }
	
	
	
	
	
}
