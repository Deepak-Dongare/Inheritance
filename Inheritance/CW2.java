package Inheritance;
class Member{
  String name;
  int age;
  String number;
  String address;
  int salary;

  public void printSalary(){
    System.out.println(salary);
    
  }

}

class Employee extends Member{
  String specialization;
}

class Manager extends Member{
  String department;
}

class CW2{
  public static void main(String[] args){
    Employee e = new Employee();
    e.name = "xyz";
    e.age = 23;
    e.number = "986****";
    e.address = "xyzxyz";
    e.salary = 1231;
    e.specialization = "xyzxyz";
    e.printSalary();

    Manager m = new Manager();
    //Same goes for Manager
  }
}	