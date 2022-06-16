package day30stringdemo;
//class extend garya xaina vanae jayle pani super class Object hunxa 
// yo day 30 ko video ma time 19:41 ma explain garya xa 
public class User {
String username;
public User (String username) {
this.username= username;}
@Override
public String toString() {  // confusion 
return username;
}
	public static void main(String[] args) {
User obj= new User("khagndra");
System.out.println(obj);
System.out.println(obj.toString());
   
System.out.println("=======================");
String obj1= new String("Rabina");
System.out.println(obj1);
	}

}
