package Inheritance;

class DemoA{
	
	void M1(){
		
		System.out.println("parent class");
	}
}
class DemoB extends DemoA{
	
	void M2() {
		System.out.println("child class");
	}
}
class DemoC extends DemoB{
	
	void m3() {
		System.out.println("second child class");
	}
}
class DemoD extends DemoC{
	void m4() {
		
		System.out.println("thread child class");
	}
}


public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoD d=new DemoD();
		d.M1();
		d.M2();
		d.m3();
		d.m4();
	}

}
