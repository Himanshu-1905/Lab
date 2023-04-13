
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("person1", 20));
        list.add(new Person("person2", 21));
        list.add(new Person("person3", 21));
        list.add(new Person("person4", 19));
        list.add(new Person("person5", 30));
        list.add(new Person("person6", 12));
        list.add(new Person("person7", 3));
        list.add(new Person("person8", 54));
        list.add(new Person("person9", 76));
        list.add(new Person("person10", 18));

        for (Person p: list){
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }
    }
}
