package e1.q1;

public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		a.baseSetB(this);
	}

	public void baseSetA(A a) {
		this.a = a;

	}
}
