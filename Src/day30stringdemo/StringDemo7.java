package day30stringdemo;

import java.util.StringTokenizer;

// Difference between split and StringTokenizer 
public class StringDemo7 {
// if we need more accuracy we can use StringTokenizer ... hoina vanae Split use garda hunxa.
//yaha tala to code ma ,,bchma (split use garda ,, kehai aru words xa vanne guss garxa ani 5 de ra xa
	public static void main(String[] args) {
		String sentence = "Hi i am khagendra Bhattarai,,I am from Nepal,, currently living at USA";
		String[] words = sentence.split(",");
		System.out.println(words.length);
		for (String w : words) {
			System.out.println(w);
		}
System.out.println("=============");	
StringTokenizer st= new StringTokenizer(sentence,",");// StringTokenizer is class name 
System.out.println(st.countTokens());
while(st.hasMoreTokens()) {
System.out.println(st.nextToken());}//
	}
}
