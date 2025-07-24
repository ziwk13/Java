package practice03_class;

public class LinkedList<T> extends List<T>{

	private Node head;
	private Node tail;
	
	@Override
	protected boolean isExists() {
		return head != null;
	}
	@Override
	public boolean add(T i) {
		Node node = new Node();
		node.setValue(i);
		int old = getIndex();
		if(!isExists()) {  // node의 첫번째이자 마지막
			head = tail = node;
		} else {
			node.setPreNode(tail);
			tail.setNextNode(node);
			tail = node;
		}
		setIndex(getIndex() + 1);
		
		return old + 1 == getIndex();
	}
	@Override
	public T get(int index) {
		if(getIndex() <= index) {
			throw new ArrayIndexOutOfBoundsException("이거 오류임 ㅇㅇ");
		}
		Node current = head;
		for(int i = 0; i <= index; i++) {
			current = current.getNextNode();
		}
		return (T)current.getValue();
	}
	@Override
	public void clear() {
		head = tail = null;
		setIndex(0);
	}
	@Override
	public boolean isEmpty() {  // 비어있는지 확인 하는 메소드
		return !isExists();
	}
	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getIndex() {
		// TODO Auto-generated method stub
		return super.getIndex();
	}

	@Override
	public void setIndex(int index) {
		// TODO Auto-generated method stub
		super.setIndex(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}
	
}
