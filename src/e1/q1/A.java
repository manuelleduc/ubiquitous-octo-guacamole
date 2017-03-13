package e1.q1;

public class A {
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		b.baseSetA(this);
	}

	public void baseSetB(B b) {
		this.b = b;
	}

}
