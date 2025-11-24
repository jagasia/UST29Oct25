
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2{
    public static void main(String[] args) {
        System.out.println("Hello from App2");
        Product p1 = new Product(1, "Laptop", 999.99, "Electronics");
        Product p2 = new Product(2, "Smartphone", 499.99, "Electronics");
        //same way, we want upto p10
        Product p3 = new Product(3, "Tablet", 299.99, "Electronics");
        Product p4 = new Product(4, "Headphones", 199.99, "Electronics");
        Product p5 = new Product(5, "Smartwatch", 149.99, "Electronics");
        Product p6 = new Product(6, "Camera", 599.99, "Electronics");
        Product p7 = new Product(7, "Printer", 89.99, "Electronics");
        Product p8 = new Product(8, "Monitor", 179.99, "Electronics");
        Product p9 = new Product(9, "Keyboard", 49.99, "Electronics");
        Product p10 = new Product(10, "Mouse", 29.99, "Electronics");

        //why all products are same category? change them along with their other details. Right now!    
        //change the category and other details of products to make them different
        p3.setCategory("Gadgets");  
        p4.setCategory("Audio");
        p5.setCategory("Wearables");

        //now those 3 products categories are changes, but theiir other details are same. Change them too
        p3.setName("E-Reader"); 
        p3.setPrice(129.99);
        p4.setName("Bluetooth Speaker");
        p4.setPrice(89.99);
        p5.setName("Fitness Tracker");
        p5.setPrice(99.99);
        //now keep these products in a HashSet
        java.util.HashSet<Product> productSet = new java.util.HashSet<>();
        //now use iterator to print all products
        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        productSet.add(p4);
        productSet.add(p5);
        productSet.add(p6);
        productSet.add(p7);
        productSet.add(p8);
        productSet.add(p9);
        productSet.add(p10);

        java.util.Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            System.out.println(p);
        }   


    //algorithm starts now. we are going to find categorywise products

        Map<String, List<Product>> map=new HashMap<>();
        for(Product p:productSet){
            List<Product> list = map.getOrDefault(p.getCategory(), new ArrayList<>());
            list.add(p);
            map.put(p.getCategory(), list);            
        }

        for(Map.Entry<String, List<Product>> e:map.entrySet()){
            System.out.println("Category: " + e.getKey());
            for(Product p:e.getValue()){
                System.out.println("   " + p);
            }
        }   


    }
}