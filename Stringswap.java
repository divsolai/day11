package java30;

import java.util.Scanner;

public class Stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String input;
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the string input");
 input=scan.next();
 char[] charArray = input.toCharArray();
 int size= charArray.length;
 char temp=charArray[0];
 charArray[0]= charArray[size-1];
 charArray[size-1]=temp;
 System.out.println("the swapped string is "+ String.valueOf(charArray));
 scan.close();
 
 
	}

}
