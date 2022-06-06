package thisdemoday22;

public class ThisDemo3 {
	OtherClass o;    // confusion on this   ...... I have to watch video again for this.
public void greet() {
	o.sayHello();
}
	public static void main(String[] args) {
		ThisDemo3 obj= new ThisDemo3();
		 obj.greet();

	}

}
