package Inheritance;

import java.util.Scanner;

class Institute{
	int Id;
	String name;//PDEA;
	
 Scanner sc=new Scanner(System.in);
 Institute(){
	System.out.println("Enter the Institute ID ");
	
	int Id =sc.nextInt();
	System.out.println("Enter the Institute Name ");
	String name=sc.next();
}
	
	
}

class Branch {
	int Id;
	String name;//computer; 
	Branch(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Branch ID");
		Id=sc.nextInt();
		
		
		System.out.println("Emter the Branch name");
		name=sc.next();
		
	}
	
	
}
class Subject extends Branch{
	int Id;
	String name;
	Scanner sc=new Scanner(System.in);
	Subject(){
		
		System.out.println("Enter the Subject ID");
		Id=sc.nextInt();
		System.out.println("Enter the Subject name");
		name=sc.next();
	}
	
}
class Topic extends Subject{
	int Id;
	String name;
	Scanner sc=new Scanner(System.in);
	Topic(){
		System.out.println("Enter the Topic Id");
		Id=sc.nextInt();
		System.out.println("Enter the Topic name");
		name=sc.next();

	}
}
class subtopic{
	
	
	int Id;
	String name;
	Scanner sc=new Scanner(System.in);
	subtopic(){
		System.out.println("Enter the subtopic Id");
		Id=sc.nextInt();
		System.out.println("Enter the subtopic name");
		name=sc.next();
		
	}
	
}

class Question {
	
	int Id;
	String name;
	Scanner sc=new Scanner(System.in);
	Question(){
		System.out.println("Enter the Question Id");
		int id =sc.nextInt();
		System.out.println("Enter the Question name");
		name=sc.next();
				
	}
	
}
class CW4 {
	Institute i;
	Branch b;
	Subject s;
	Topic t;
	subtopic st;
	Question q;
	CW4(){
	  
	i= new Institute();
	b=new Branch();
	s=new Subject();
	t=new Topic();
	st=new subtopic();
	q=new Question();
}

void display(){
	System.out.println(""+i.Id+""+i.name);
	System.out.println(""+b.Id+""+b.name);
	System.out.println(""+s.Id+""+s.name);
	System.out.println(""+t.Id+""+t.name);
	System.out.println(""+st.Id+""+s.name);
	System.out.println(""+q.Id+""+q.name);
	
	
}

}



public class CW4Institute {
	public static void main(String[] args) {
		
		CW4 c=new CW4();
		
		c.display();
	}
	
	

	
}
