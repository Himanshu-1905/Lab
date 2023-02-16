
/*
Question-2 = Class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. (Which type Of Inheritance explain with an example)
Answer = Multilevel inheritance : The class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. The class B is known as intermediate base class because it provides a link for the inheritance between A and C.
*/
class School {
	void show() {
		System.out.println("Contain both Teacher & Student");
	}
}
class Teacher extends School{
	void display() {
		System.out.println("Teaches Student");
	}
}
class Student extends School{
	void print() {
		System.out.println("Learns from Teacher");
	}
}
public class InheritanceLab2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.print();
		Teacher t = new Teacher();
		t.show();
		t.display();
	}
}
