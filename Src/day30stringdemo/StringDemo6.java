package day30stringdemo;

import java.util.StringTokenizer;

public class StringDemo6 {

	public static void main(String[] args) {
    String sentence="Hi i am khagendra Bhattarai, I am from Nepal currently living at USA";	
    StringTokenizer st= new StringTokenizer(sentence);// StringTokenizer is class name 
    while(st.hasMoreTokens()) {
	System.out.println(st.nextToken());}// ale jha jha space xa tya bata break garxa
	System.out.println("=========================");
	String sentence2="Hi i am khagendra Bhattarai, I am from Nepal currently living at USA";	
	StringTokenizer st2= new StringTokenizer(sentence,","); // aslae jha jha commas xa tya bata break garxa
	while(st2.hasMoreTokens()) {
		System.out.println(st2.nextToken());
		
	
}
	}

	}
