package e1.q1;

public class App {
	public static void main(final String[] args) {
		final A a = new A();
		final B b = new B();

		a.setB(b);

		final A a2 = b.getA();
		System.out.println(a2 == a);
	}
}
