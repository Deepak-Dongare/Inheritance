package Inheritance;

class Laptop {
	int noOfUSBport;
	int processorSpeed ;
	public int getNoOfUSBport() {
		return noOfUSBport;
	}
	public void setNoOfUSBport(int noOfUSBport) {
		this.noOfUSBport = noOfUSBport;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
}

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l=new Laptop();
		l.setNoOfUSBport(3);
		
		
		int a=l.getNoOfUSBport();
		System.out.println(a);
		
		l.setProcessorSpeed(23);
		int b=l.getProcessorSpeed();
		System.out.println(b);

	}

}
