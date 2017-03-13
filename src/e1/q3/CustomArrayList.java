package e1.q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CustomArrayList<T extends B> extends ArrayList<T> implements Collection<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2488282281630470346L;
	private A a;

	public CustomArrayList(A a) {
		this.a = a;
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return super.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		return super.iterator();
	}

	@Override
	public Object[] toArray() {

		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return super.toArray(a);
	}

	@Override
	public boolean add(T e) {

		e.baseSetA(this.a);
		return super.add(e);
	}

	@Override
	public boolean remove(Object o) {
		if (o instanceof B) {
			((B) o).baseSetA(null);
		}
		return super.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {

		return super.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {

		c.stream().forEach(e -> e.baseSetA(this.a));
		return super.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		c.stream().forEach(e -> {
			if (e instanceof B)
				((B) e).baseSetA(null);
		});
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		this.forEach(e -> e.baseSetA(null));
		boolean all = super.retainAll(c);
		this.forEach(e -> e.baseSetA(this.a));
		return all;
	}

	@Override
	public void clear() {
		this.forEach(e -> e.baseSetA(null));
		super.clear();

	}

	public void baseAdd(T b) {
		super.add(b);
	}

}
