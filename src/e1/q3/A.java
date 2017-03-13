package e1.q3;

public class A {
	private final CustomArrayList<B> b = new CustomArrayList<B>(this);

	public CustomArrayList<B> getB() {
		return b;
	}
}
