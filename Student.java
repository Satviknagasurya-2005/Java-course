public class Student {
//    String name;
//    int age;
//    Student(String n,int a){
//        name=n;
//        age=a;
//    }
//    public static void main(String args[]){
//        Student obj=new Student("murari",20);
//        System.out.println(obj.name+" "+obj.age);
//    }




    String name;
    int rollno;

    Student(String n,int a){
        name=n;
        rollno=a;
    }
    void display(){
        int marks=90;
        System.out.println(name+" "+marks+" ",rollno);
    }
    public static void main(String args[]){
        Student obj=new Student("murari",480);
        obj.display();
    }
}
