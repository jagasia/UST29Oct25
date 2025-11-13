
public class JNode<T> {
	private T data;
	private JNode next;
	
	public JNode() {}
	
	public JNode(T data) {
		super();
		this.data = data;
	}

	public JNode(T data, JNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public JNode getNext() {
		return next;
	}

	public void setNext(JNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "JNode [data=" + data + ", next=" + next + "]";
	}
	
	
}
