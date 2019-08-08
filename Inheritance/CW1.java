package Inheritance;

class ADemo{
	
	int a=1;
	int b=2;
}
class BDemo extends  ADemo{
	
	int c=3;
	int d=4;
	
	
}
public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BDemo  d=new BDemo();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);

	}

}
