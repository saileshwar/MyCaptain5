class Employee{
  private String name, address;
  private int year, salary;
  public Employee(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Ravi", 1999, 500000, "Hyderabad");
    Employee e2 = new Employee("Sailesh", 2001, 100000, "Vishakapatnam");
    Employee e3 = new Employee("Mahesh", 2000, 600000,"Guntur");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t"+e1.getSalary()+"\t"+e1.getAddress()); 
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t"+e2.getSalary()+"\t"+e2.getAddress()); 
    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t"+e3.getSalary()+"\t"+e3.getAddress()); 
  }
}
