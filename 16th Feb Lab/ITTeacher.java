/*
 In this example, you have a base class Teacher and a sub class IT Teacher. Since class  IT Teacher extends the designation and college properties and work () method from base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the teachers so we have declared them in the base class, this way the child classes like Math Teacher and Soft Skill Teacher do not need to write this code and can be used directly from base class.
*/
class Teacher {
    String collegeName = "Gurugram University";
    String designation = "Teacher";
    void work(){
        System.out.println("Teaching");
    }
}

class ITTeacher extends Teacher{
    public static void main(String[] args) {
        ITTeacher t =  new ITTeacher();
        System.out.println(t.collegeName);
        System.out.println(t.designation);
        t.work();
    }
}



