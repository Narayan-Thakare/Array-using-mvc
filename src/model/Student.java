package model;

public class Student {
	int r;
	String n,a;
	
		private int roll;
		private String name;
		private String address;
		public int getAddress;
		
		
		public Student(int r, String n, String a)
		{
			
			roll = r;
			name = n;
			address =a;
		}
		public Student()
		{
			roll=0;
			name="unknown";
			address="unknown";
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String Address) {
			address = a;
		}
	
	
	
	
}
