package practice03_class;

import java.util.Arrays;

public class ArrayList {

	private int[] arr;
	private int index;

	public boolean add(int i) {
		if(!isExists()) {
			arr = new int[10];
		} 
		if(isFull()) {
			sizeUp();
		}
		int old = index;
		arr[index++] = i;
		if(old + 1 == index) {
			return true;
		}
		return false;
	}
	private boolean isExists() {
		if(arr != null) {
			return true;
		} else return false;
	}
	private boolean isFull() {
		if(arr.length == index) {
			return true;
		}
		return false;
	}
	private void sizeUp() {
		int[] newArr = new int[(int)(arr.length * 1.5)];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	@Override
	public String toString() {
		return arr.toString();
	}
	public int size() {
		return index;
	}
	public int arrLengthSize() {
		return arr.length;
	}
	public int get(int index) {
		if(this.index <= index) {
			throw new ArrayIndexOutOfBoundsException("이거 오류임 ㅇㅇ");
		}
		return arr[index];  // 인덱스를 받아서 해당 인덱스의 요소를 반환
	}
	public void trimToSize() {
		if(!isExists() || index == arr.length) return;
		int[] newArr = new int[index];
		for(int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	public void clear() {
		arr = null;
		index = 0;
	}
	public boolean isEmpty() {
		if(index == 0 || isExists()) {
			return true;
		} else return false;
	}
	public int remove(int index) {
		int removeValue = arr[index];
		for(int i = index; i < this.index - 1; i++) {
			arr[i] = arr[i + 1];
		}
		this.index--;
		return removeValue;
	}
}
