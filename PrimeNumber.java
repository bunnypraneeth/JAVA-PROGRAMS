import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		int i,m,flag=0;
		m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not a prime number");      
		  }
		  else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not a prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { 
			   System.out.println(n+" is a prime number");
			   }  
		  } 
		}    

	}


