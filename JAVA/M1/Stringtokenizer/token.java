package Stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class token {
	
	int n;
	String name;
	int sum = 0;
	
	
	public void display(){
		Scanner inputname = new Scanner(System.in);
		System.out.print("Enter your integers : " );
		name = inputname.nextLine();
		inputname.close();

	}
	
	public void tokenstring(){
		StringTokenizer tk = new StringTokenizer(name," ");
		while(tk.hasMoreTokens()){
			System.out.println(tk.nextToken());
		}
			
	}

	public void sum(){
		StringTokenizer tk = new StringTokenizer(name," ");
		while (tk.hasMoreTokens()){
			String temp = tk.nextToken();
			n = Integer.parseInt(temp);
			sum = sum + n;
			
		}
		System.out.println(sum);

	}

}

