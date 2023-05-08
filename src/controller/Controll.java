package controller;

import java.util.Scanner;

import model.Student;


public class Controll {

	Student s[];
	int n;

	Scanner sc =new Scanner(System.in);
	public Controll()
	{
		s=new Student[30];
	}
///////////////////////////////////////////////////////////////
	public void addstudent()
	{
		System.out.println("Enter the no. of Student :");
		n=Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the roll no.");
	  int roll=Integer.parseInt(sc.nextLine());
	  System.out.println("enter the name");
	  String name=sc.nextLine();
	  System.out.println("Enter the address");
	  String address=sc.nextLine();
	  
	  s[i]=new Student();
	  s[i].setRoll(roll);
	  s[i].setName(name);
	  s[i].setAddress(address);
	  
	}
		
		
	}
	/////////////////////////////////////////////////////
	public void show()
	{
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i].getRoll()+" "+s[i].getName()+" "+s[i].getAddress);
			
		}
	}
///////////////////////////////////////////////////////////////////		
		public void update()
		{
			int rollnew;
			String newName=null;
	        
	        
	        
	        System.out.print("Enter Your Roll no:");
	        rollnew=Integer.parseInt(sc.nextLine());
	        for(int i=0;i<s.length;i++)
	        {
	        	if(rollnew==s[i].getRoll())
	        	{
	        		System.out.println("\tRoll no"+"\t\tNAME"+"\tAddress");
	        		System.out.println("\t"+s[i].getRoll()+"\t\t"+s[i].getName()+"\t\t"+s[i].getAddress());

	        		System.out.println("ok....What You Want To Update.");
	        		System.out.println("1.Name \n 2.Address");
	        		System.out.print("Enter The Choice :");
	        		 
	        		int choice=Integer.parseInt(sc.nextLine());
                  switch(choice) 
                  {
	        		
	        		case 1:
	        			System.out.println("Your Old Name is :"+s[i].getName());
	        			System.out.println("What is your Correct Name ?");
	        			 newName=sc.nextLine();
	        			System.out.println("Your New Name is "+newName+" And Your Old Name is "+s[i].getName()+".");
	        		break;
	        		case 2:
	        			System.out.println("Your Old Address is :"+s[i].getAddress());
	        			System.out.println("What is your Correct Address ?");
	        			String newAddress=sc.nextLine();
	        			System.out.println("Your New Name is "+newAddress+" And Your Old Name is "+s[i].getAddress()+".");
	        		break;
	        			
}
			
	        	}
			
		}
		
		
	
		}
		
		public void search()
		{
			
        System.out.print("Enter Your Roll no:");
       int rollnew=Integer.parseInt(sc.nextLine());
        for(int i=0;i<s.length;i++)
        {
        	if(rollnew==s[i].getRoll())
        	{
        		System.out.println("Roll no"+"\t\tNAME"+ "\t\tAddress");
        		System.out.println(s[i].getRoll()+"\t\t"+s[i].getName()+"\t\t"+s[i].getAddress());
        	}
        	
        
        else
        {System.out.println("Roll no. does not exist");}}
       }





}
