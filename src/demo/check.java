package demo;

public class check{

	
	
	public void rafi()
	{
		System.out.println("non parameter method");
	}
	 void rafi(String name, int pincode)
	 {
		 System.out.println(name+pincode);
	 }
	

	
	public static void main(String[] args) {
		
		check l = new check();
		l.rafi();
		l.rafi("mohammed", 5183606);
		
	}
	
}
