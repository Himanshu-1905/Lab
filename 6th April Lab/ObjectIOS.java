
/*
3. Write a java code by using ObjectInput & OutputStream along with transient keyword.
*/
import java.io.*;

class Book implements Serializable{
    transient int id;
    String name;
    String author;
    transient int price;

    public Book(int id, String name, String author, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ObjectIOS {
    public static void main(String[] args) {
        try{
            Book b = new Book(10, "Circe", "Madeline Miller", 300);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Languages\\java\\File.txt"));  
            oos.writeObject(b);
            oos.close();
            System.out.println("Done");

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Languages\\java\\File.txt"));
            Book book = (Book) ois.readObject();
            System.out.println(book);
            ois.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
