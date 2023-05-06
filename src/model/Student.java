package model;

public class Student {
	int r;
	String n;
		private int roll;
		private String name;
		
		public Student(int r, String n)
		{
			
			roll = r;
			name = n;
		}
		public Student()
		{
			roll=0;
			name="unknown";
		}
		public int getRoll()
		{
			return roll;
		}
		public void setRoll(int roll)
		{
			roll = r;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			name = n;
		}
	
	
	
	
	
}
