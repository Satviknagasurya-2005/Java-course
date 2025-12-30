public class UtilityMethod(){

int classLevelVariable=006;
    void method(){
        MethodBasics obj2=new MethodBasics();
        System.out.println(obj2.classLevelVariable);
    }
    public static void main(String args []){
        MethodBasics obj=new MethodBasics();
        obj.method();
    }
}