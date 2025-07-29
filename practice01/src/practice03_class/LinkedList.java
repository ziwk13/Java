package practice03_class;

public class LinkedList<T> extends List<T>{

	private Node head;
	private Node tail;
	
	@Override
	protected boolean isExists() { // 존재 여부
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
	
	private void isInBound(int index) {
		if(getIndex() <= index || index < 0) {
			throw new ArrayIndexOutOfBoundsException("이거 오류임 ㅇㅇ");
		}
	}
	
	private Node getNodeByIndex(int index) {
		Node current = head;
		for(int i = 0; i <= index; i++) {
			current = current.getNextNode();
		}
		return current;
	}
	
	@Override
	public T get(int index) {
		
		isInBound(index);
		
		return (T)getNodeByIndex(index).getValue();
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
		isInBound(index);

		Node current = getNodeByIndex(index);
		T removedValue = (T)current.getValue();
		
		// node가 1개일 때
		// 해당 node만 지우기
		if(current == head && current == tail) {
			clear();
			setIndex(1);
		}
		
		// node가 head인 경우
		// tail을 head로 변경
		else if(current == head) {
			head = current.getNextNode();
			head.setPreNode(null);
		}
		
		// node가 tail인 경우
		// 해당 node만 지우기
		else if(current == tail) {
			tail = current.getPreNode();
			tail.setNextNode(null);
		}
		
		// node가 3개 이상 일 때 (head, tail이 아닌 경우)
		// 해당 node의 이전 node와 다음 node를 연결
		else {
			current.getNextNode().setPreNode(current.getNextNode());
			current.getPreNode().setNextNode(current.getPreNode());
			
		}
		// 지운 node size - 1
		setIndex(getIndex() - 1);
		
		return removedValue;
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
