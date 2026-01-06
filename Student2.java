public class Student2 {
    int id;

    void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Student2 obj = new Student2();
        obj.setId(101);
        System.out.println(obj.id);
    }
}