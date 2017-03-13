package e1.q2;

public class App {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		b.setA(a);
		
		System.out.println(a == b.getA());
	}
}
