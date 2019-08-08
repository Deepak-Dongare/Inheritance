package Inheritance;

class Kid{
	void readBook(){
		
		System.out.println(" singal parameter method");
		
	}
	void readBook(int a,int b ){
		
		System.out.println("double parameter method ");
		
	}
}
class BigKid  extends Kid{
	 
	void readBook(){

		System.out.println("over-ridden");
	}
	
	
} 

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigKid b=new BigKid();
		b.readBook();
		
	}

}
