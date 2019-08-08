package Inheritance;

class A{
	static int a=10;
	boolean m1(){
		return true;
		
	}
	void m4(int a){
		System.out.println("m2");
		
	}
}
	class B extends A{
		
		int a=30;
		boolean m2(){
			return true;
			
		}
		
		
	}
	
class C extends B{
	int a=20;
	void m3(){
		
		System.out.println(super.a);
		System.out.print(super.m1());
		//System.out.println(m4(1));
		m4(1);
		
	}
}
class INmain{
	public static void main(String[] args) {
		C c=new C();
		c.m3();
		
	}
}

