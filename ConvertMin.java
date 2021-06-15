import java.util.*;

public class ConvertMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int min;
		System.out.println("Input the number of minutes:");
		min=sc.nextInt();

		int x=60*24*365;
		int years,days;
		years=(min/x);
		days=(min/60/24)%365;
		System.out.println(min+" minutes is approximately " +years+" years and " + days +" days");
		

	}

}
