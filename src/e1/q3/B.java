package e1.q3;

public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		a.getB().baseAdd(this);
	}

	public void baseSetA(A a) {
		this.a = a;
	}
}
