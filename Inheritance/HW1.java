package Inheritance;

class parent {
	void print(){
		System.out.println("parent class");
		
	}
}
class subclass extends parent{	void print(){
		System.out.println("sub class ");
		
	}
	
}
public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent p=new parent();
		//p.pprint();
		subclass s =new subclass();
		//s.print();
		s.print();

	}

}
