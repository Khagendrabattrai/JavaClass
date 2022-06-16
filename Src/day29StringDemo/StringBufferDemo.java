package day29StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Namaste");// StringBuilder is immutable class
        //of javalang pakage
System.out.println(sb);
sb.append(" Darsan " );   // append is a method name javalang pakage ma vako
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
sb.substring(0,6);
System.out.println(sb);
	}

}
