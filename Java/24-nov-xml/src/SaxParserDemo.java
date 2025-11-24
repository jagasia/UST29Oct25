import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.io.File;

public class SaxParserDemo {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("books.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean bTitle  = false;
                boolean bAuthor = false;
                boolean bYear   = false;

                @Override
                public void startElement(String uri, String localName,
                                         String qName, Attributes attributes)
                                         throws SAXException {
                    if (qName.equalsIgnoreCase("book")) {
                        System.out.println("------------------------");
                        System.out.println("Book ID : " + attributes.getValue("id"));
                    } else if (qName.equalsIgnoreCase("title")) {
                        bTitle = true;
                    } else if (qName.equalsIgnoreCase("author")) {
                        bAuthor = true;
                    } else if (qName.equalsIgnoreCase("year")) {
                        bYear = true;
                    }
                }

                @Override
                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {
                    // No specific action for this demo
                }

                @Override
                public void characters(char[] ch, int start, int length)
                                       throws SAXException {
                    if (bTitle) {
                        System.out.println("Title : " + new String(ch, start, length));
                        bTitle = false;
                    } else if (bAuthor) {
                        System.out.println("Author : " + new String(ch, start, length));
                        bAuthor = false;
                    } else if (bYear) {
                        System.out.println("Year : " + new String(ch, start, length));
                        bYear = false;
                    }
                }
            };

            saxParser.parse(xmlFile, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
