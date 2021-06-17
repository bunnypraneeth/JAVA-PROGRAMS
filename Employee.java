public class GetEmpDetails{
	  private String name, address;
	  private int year, salary;
	  public GetEmpDetails(String n, int y, int sal, String add){
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

//OTHER CLASS (file) PROGRAM OF EMPLOYEE

class Employee{
	  public static void main(String[] args){
		GetEmpDetails e1 = new GetEmpDetails("ABC", 1992, 500000, "Mumbai");
		GetEmpDetails e2 = new GetEmpDetails("DEF", 1994, 740000, "Mumbai");
		GetEmpDetails e3 = new GetEmpDetails("XYZ", 1998, 600000, "Mumbai");
	    System.out.println("Name\t\tYear of joining\t\tSalary\t\tAddress");
	    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t\t"+e1.getAddress()); 
	    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t\t"+e2.getAddress());  
	    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t\t"+e3.getAddress()); 
	  }
	}
