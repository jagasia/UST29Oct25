
public class App {

	public static void main(String[] args) {
//		Mathematics<Integer> m=new Mathematics<>();
//		Integer result = m.add(2, 3);
//		System.out.println(result);
		
//		Mathematics<Float> m=new Mathematics<>();
//		System.out.println(m.add(1.5f, 2.5f));
		
		JLinkedList<String> list=new JLinkedList<>();
		list.addNode("India");
		list.addNode("Australia");
		list.addNode("Pakistan");
		list.addNode("Bangladesh");
		
		System.out.println("Displaying all nodes.....");
		list.traverse();
		
//		JLinkedList<? super Number> list2=new JLinkedList<>();
//		list2.addNode(10);
		
		
	}

}
