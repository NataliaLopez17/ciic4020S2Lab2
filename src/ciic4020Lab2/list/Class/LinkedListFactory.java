package ciic4020Lab2.list.Class;

import ciic4020Lab2.list.Interface.List;
import ciic4020Lab2.list.Interface.ListFactory;

public class LinkedListFactory<E> implements ListFactory<E> {

	@Override
	public List<E> newInstance(int initialCapacity) {
		// We don't pre-allocate nodes, so initialCapacity isn't actually used
		return new LinkedList<E>();
	}

	@Override
	public List<E> newInstance() {
		return new LinkedList<E>();
	}

}