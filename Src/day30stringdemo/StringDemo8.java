package day30stringdemo;

public class StringDemo8 {
	// regular epression
	public static void main(String[] args) {
		StringDemo8 obj = new StringDemo8();
		System.out.println(obj.isYes("yes"));
		System.out.println(obj.isYes("Yes"));
		System.out.println("===================");
		System.out.println(obj.isYesOrNo("yes"));
		System.out.println(obj.isYesOrNo("Yes"));
		System.out.println(obj.isYesOrNo("no"));
		System.out.println(obj.isYesOrNo("No"));
		System.out.println("****************************");
        System.out.println(obj.isString("Hello"));
        System.out.println(obj.isString("1"));
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println(obj.validatePassword("abcde"));
        System.out.println(obj.validatePassword("Abc#1245"));//   confusion:yo doitai case ma false de ra xa 
        System.out.println(obj.validatePassword("Go1234@d"));

	}
	public boolean isYes(String s) {
		boolean result = s.matches("[Y|y]es");
		
		return result;
	
	
	}
	public boolean isYesOrNo(String s) {
		boolean result = s.matches("[Y|y]es|[N|n]o");
		return result;

	}
	public boolean isString(String s) {
		boolean result=s.matches("[0-9]");
		return result;
		
	}
	public boolean validatePassword(String password) {
	String regex= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$";
	return password.matches(regex);    
	}
}