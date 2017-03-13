package e1.q3;

public class App {
	public static void main(final String[] args) {
		final A a = new A();

		final B b1 = new B();
		final B b2 = new B();

		a.getB().add(b1);

		b2.setA(a);

		System.out.println(a.getB().contains(b1));
		System.out.println(a.getB().contains(b2));

		System.out.println(b1.getA() == a);
		System.out.println(b2.getA() == a);

	}
}
