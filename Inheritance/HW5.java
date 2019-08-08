package Inheritance;

class IPLTeam {
	
	void play(){
		System.out.println("play IPL team");
		
	}
}
class CSK extends IPLTeam{
	
}
class RCB extends CSK{
	
}
public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RCB r=new RCB();
		r.play();

	}

}
