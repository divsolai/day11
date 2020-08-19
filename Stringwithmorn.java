package java30;

import java.util.Scanner;

public class Stringwithmorn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the string input");
		 input=scan.nextLine();
		 String[] split = input.split(" ");
		 int size=split.length;
		 for(int i=0;i<size-1;i++)
		 {
			if(split[i].startsWith("m")|| split[i].startsWith("n"))
			{
				System.out.print(split[i]+" \t");
			}
		 }
		 scan.close();
	}

}
