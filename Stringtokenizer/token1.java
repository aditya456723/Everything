package Stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class token1 {
	String name1;

	
	
	public void display(){
		Scanner inputname = new Scanner(System.in);
		System.out.print("Enter your integers : " );
		name1 = inputname.nextLine();
		inputname.close();

	}
	
	public void tokenstring(){
		StringTokenizer tk = new StringTokenizer(name1,"#@$%&");
		while(tk.hasMoreTokens()){
			System.out.println(tk.nextToken());
		}
	}


}


