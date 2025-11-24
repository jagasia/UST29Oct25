import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("books.xml");
		document.normalize();
		NodeList books = document.getElementsByTagName("book");
		for(int i=0;i<books.getLength();i++) {
			Node book = books.item(i);
			System.out.print(book.getNodeName()+"\t");
			System.out.println(books.item(i).getAttributes().item(0));
			NodeList children = book.getChildNodes();
			for(int j=0;j<children.getLength();j++) {
				if(children.item(i).getNodeType()==Node.ELEMENT_NODE)
				System.out.println("-- "+children.item(j).getNodeName()+"\t"+children.item(j).getTextContent());
			}
		}
	}

}
