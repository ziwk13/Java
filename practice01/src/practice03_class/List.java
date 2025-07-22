package practice03_class;

 public abstract class List<T> {

	private int index;

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	protected abstract boolean isExists();

	public abstract boolean add(T i);

	public int size() {
		return index;
	}
	
	public abstract void clear();
	
	public abstract boolean isEmpty();

	public abstract T remove(int index);

	public abstract T get(int index);

}