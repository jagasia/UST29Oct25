import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class DomParserDemo {
	public static void main(String[] args) {
		try {
			File xmlFile = new File("books.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList bookList = doc.getElementsByTagName("book");
			for (int i = 0; i < bookList.getLength(); i++) {
				Node bookNode = bookList.item(i);
				System.out.println("------------------------");
				if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
					Element bookElement = (Element) bookNode;
					System.out.println("Book ID : " + bookElement.getAttribute("id"));
					System.out.println("Title : " + bookElement.getElementsByTagName("title").item(0).getTextContent());
					System.out
							.println("Author : " + bookElement.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("Year : " + bookElement.getElementsByTagName("year").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
