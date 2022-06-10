package day25inheritance;

public class ParentTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.greet();

		Child c = new Child();
		System.out.println(c.name);
		c.greet();
		GrandChild g= new GrandChild();
		System.out.println(g.name);
		g.greet();
	}

}
