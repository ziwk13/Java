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
	public int size() {
		return index;
	}
	public int arrLengthSize() {
		return arr.length;
	}
}
