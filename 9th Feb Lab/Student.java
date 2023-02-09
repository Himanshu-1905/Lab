
public class Student {
	Student(){ //default constructor
		System.out.println("Default");
	}
		int sum;
	    Student(int a, int b){ //parameterized constructor
	    sum=a+b;
	    }
	  void show(){
      System.out.println("sum : "+sum);
	  } 
	  public static void main(String args[]) {
		  Student obj = new Student();
	      Student obj1 = new Student(20,30);
	      obj1.show();
	  }
	}