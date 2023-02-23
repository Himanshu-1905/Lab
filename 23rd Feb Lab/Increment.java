
public class Increment {
    public static void main(String[] args) {
        Developer d = new Developer(60000);
        d.incrementSalary();
        System.out.println("Developer's salary is now " + d.getSalary());

        Manager m = new Manager(70000);
        m.incrementSalary();
        System.out.println("Manager's salary is now " + m.getSalary());
    }
}

class Employee {
    double salary;
    public Employee(double salary) {
        this.salary = salary;
    }
    public void incrementSalary() {
        this.salary *= 1.05;
    }
    public double getSalary() {
        return salary;
    }
}

class Developer extends Employee {
    public Developer(double salary) {
        super(salary);
    }
    @Override
    public void incrementSalary() {
        this.salary *= 1.10;
    }
}

class Manager extends Employee {
    public Manager(double salary) {
        super(salary);
    }
    @Override
    public void incrementSalary() {
        this.salary *= 1.15;
    }
}


