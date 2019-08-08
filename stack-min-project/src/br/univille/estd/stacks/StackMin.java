package br.univille.estd.stacks;

import br.univille.estd.stacks.FullStackException;

public class StackMin<E> implements Stack<E> {

	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E S[];
	protected int top = -1;
	public StackMin() {
		this(CAPACITY);
	}
	public StackMin(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
	}
	
	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public E top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia");
		}
		else {
			return S[top];
		}
	}

	@Override
	public void push(E element) {
		if (size() == capacity) {
			throw new FullStackException("Pilha cheia");
		}
		else {
			top = top + 1;
			S[top] = element;
		}
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia");
		}
		else {
			E e = S[top];
			S[top] = null;
			top = top - 1; 
			return e;
		}
	}

	@Override
	public E min() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

}
