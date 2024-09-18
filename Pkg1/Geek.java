package Pkg1;

abstract class Rbi
{
   //abstract method
   public abstract void deposit();
}

interface inf
{
	public static final int i = 0;
	void display();
}

 public class Geek extends Rbi {
	 
	 public void deposit()
	 {
		 System.out.println("Hi i am in Geek class");
		 System.out.println("Something new");
	 }
	 
	 public static void main(String args[])
	   {
	      Rbi obj = new Geek();
	      obj.deposit();
	   }
	

}
