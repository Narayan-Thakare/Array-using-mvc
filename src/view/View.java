package view;

import java.util.Scanner;

import controller.Controll;

public class View {
	
	 public  View()
	 {
		 Controll c= new Controll();
		 Scanner sc = new Scanner(System.in);
		 int choice=0;  
		 boolean loop=true;
		 
		while (loop){  
			 
		
		 System.out.println("1.Add Student");
		 System.out.println("2.Show Student");
		 System.out.println("3.Update Student");
		 System.out.println("4.Search Student");
		 System.out.println("0.exit");
		 System.out.println("Enter the choice");
		 int choice1=Integer.parseInt(sc.nextLine());
		
		 
		 switch(choice1)
		 {
		 
		 case 1:
			c.addstudent();
			break;
			
		 case 2:
			 c.show();
			 break;
		 
		 case 3:
			 c.update();
			 break;
		 case 4:
			 c.search();
			 break;
		 case 0:
			 loop=false;
			 break;
			 
		 
		 
		 }

		 
		 }
		 


	 
 
	
	
 	
	
	
}
}