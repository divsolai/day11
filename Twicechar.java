package java30;

import java.util.Scanner;

public class Twicechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the string input");
		 input=scan.next();
		 char[] charArray = input.toCharArray();
		 for(int i=0;i<charArray.length;i++) {
			 System.out.print(charArray[i]);
			 System.out.print(charArray[i]);
		 }
		 
		 scan.close();
		 
	}

}
