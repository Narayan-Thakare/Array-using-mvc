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

	public void addstudent()
	{
		System.out.println("Enter the no. of Student :");
		n=Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the roll no.");
	  int roll=Integer.parseInt(sc.nextLine());
	  System.out.println("enetr the name");
	  String name=sc.nextLine();
	  
	  s[i]=new Student(roll,name);
	}
		
		
	}
	public void show()
	{
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i].getRoll()+" "+s[i].getName());
			
		}
	}
		
		
		
		
		
		
		

	
	
	
}
