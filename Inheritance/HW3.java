package Inheritance;


class DemoA1{
	void m1(){
		System.out.println("frist class");
	}
}
class DemoB1 extends DemoA1{
	
	
	void m2(){
		
		System.out.println("second  class ");
		
	}
	
	
}
class DemoC1 extends DemoA1{
	
	void m3() {
		
		
		System.out.println(" second class");
	}
	
	
}

class DemoD1 extends DemoA1{
	void m4() {
		System.out.println("thread class");
	}
}
public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoB1 b=new DemoB1();
		b.m1();
		b.m2();
		DemoC1 c=new DemoC1();
		c.m3();
		c.m1();
		DemoD1 d=new DemoD1();
		d.m4();
		d.m1();
		
		

	}

}
