import java.util.*;

public class SwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pick One :1. Hi \t 2.Hello \t 3.hey");
		Scanner sc=new Scanner(System.in);
		int ch;
		ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("You picked Hi");
				break;
		case 2: System.out.println("You picked Hello");
				break;
		case 3: System.out.println("You picked hey");
				break;
		default: System.out.println("invalid choice");
				
		}
}
}
