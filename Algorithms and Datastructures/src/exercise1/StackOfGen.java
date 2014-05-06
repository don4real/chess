package exercise1;

import java.util.Iterator;

public class StackOfGen<T> implements Iterable<Integer>{
	private T[] gen;
	//private int stackSize;
	private int curStack;
	@SuppressWarnings("unchecked")
	public StackOfGen(int size){
		//stackSize = -1;
		gen = (T[]) new Object[size];
	}
	public void push(T i){
		//curStack = stackSize+1;
		gen[curStack] = i;
		curStack++;

	}
	public T pop(){
		return gen[--curStack];
	}
	public int size(){
		return curStack;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
