import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0,b=1,c,i,count; 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the count:");
		 count=sc.nextInt();
		 System.out.print(a+" "+b);
		    
		 for(i=2;i<count;++i)   
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;    
		 }    
		  
		}

	}


