package day29StringDemo;

public class StringBuilderDemo {// To mute or change the string java has given a different library class that is called stringBuilder.
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Namaste");// StringBuilder is immutable class
		                                               //of javalang pakage
		System.out.println(sb);
		sb.append(" evening " );   // append is a method name javalang pakage ma vako
		System.out.println( sb );// yahahamilae reassign garya xaina direct sb lai change garya xau.
		sb.insert(3, "NAM");// aslae Namaste ko bch ma NAM insert garxa
		System.out.println(sb);
		sb.insert(0, "Hello,");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		//append, insert,delete sap javalang pkage ko method ho.
		sb.reverse();
	   System.out.println(sb);
		
	}

}
