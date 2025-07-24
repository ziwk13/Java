package practice03_class;

import java.util.Arrays;

public class ArrayList<T> extends List<T>{

	private Object[] arr;

	@Override
	public boolean add(T i) {
		if(!isExists()) {
			arr = new Object[10];
		} 
		if(isFull()) {
			sizeUp();
		}
		int old = getIndex();
		arr[getIndex()] = i;
		setIndex(getIndex() + 1);
		if(old + 1 == getIndex()) {
			return true;
		}
		return false;
	}
	@Override
	protected boolean isExists() {
		if(arr != null) {
			return true;
		} else return false;
	}
	private boolean isFull() {
		if(arr.length == getIndex()) {
			return true;
		}
		return false;
	}
	private void sizeUp() {
		Object[] newArr = new Object[(int)(arr.length * 1.5)];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	public void trimToSize() {
		if(!isExists() || getIndex() == arr.length) return;
		Object[] newArr = new Object[getIndex()];
		for(int i = 0; i < getIndex(); i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	public void clear() {
		arr = null;
		setIndex(0);
	}
	@Override
	public boolean isEmpty() {
		if(getIndex() == 0 || isExists()) {
			return true;
		} else return false;
	}
	@Override
	public T remove(int index) {
		T removeValue = (T)arr[index];
		for(int i = index; i < getIndex() - 1; i++) {
			arr[i] = arr[i + 1];
		}
		setIndex(getIndex() - 1);
		return removeValue;
	}
	@Override
	public T get(int index) {
		if(getIndex() <= index) {
			throw new ArrayIndexOutOfBoundsException("이거 오류임 ㅇㅇ");
		}
		return (T)arr[index];  // 인덱스를 받아서 해당 인덱스의 요소를 반환
	}
}
