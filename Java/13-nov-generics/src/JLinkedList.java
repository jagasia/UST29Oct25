
public class JLinkedList<T> {
	private JNode<T> head;
	
	public JLinkedList() {}

	public JLinkedList(JNode<T> head) {
		this.head = head;
	}

	public JNode<T> getHead() {
		return head;
	}

	public void setHead(JNode<T> head) {
		this.head = head;
	}
	
	public void addNode(T data) {
		JNode<T> node=new JNode<>(data);
		//find the tail and add the node.
		JNode<T> tail=null;
		if(head==null) {
			//linkedlist is currently empty. So adding node at head
			head=node;
			System.out.println("New node is added at head");
			return;
		}
		for(tail=head;tail.getNext()!=null;tail=tail.getNext());
		tail.setNext(node);
		//done.
		System.out.println("New node is added at tail");				
	}
	
	public void traverse() {
		for(JNode<T> temp=head;temp!=null;temp=temp.getNext()) {
			System.out.println(temp.getData());
		}
	}
}
