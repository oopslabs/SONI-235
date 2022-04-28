package co2;
import java.util.*;
public class manu {

	public static void main(String[] args) {
		String m,n;
		Scanner in =new Scanner(System.in);
		System.out.println("enter the string:");
		m=in.nextLine();
		System.out.println("length of the string:" +m.length());
		System.out.println("index of string:" +m.indexOf('n'));
		System.out.println("Uppercase of string:" +m.toUpperCase());
		System.out.println("LOwercase of string:" +m.toLowerCase());
		System.out.println("enter the string to concat:");
		n=in.nextLine();
		String str=m.concat(n);
		System.out.println(str);
		String t="tessy";
		System.out.println("the replaced strimg is:" +t.replace('s','p'));
		

	}

}
