public class MethodBasics{
    int add(int a ,int b){
        int c=a+b;
        return c;
    }
    public static void main(String args[]){
        MethodBasics obj = new MethodBasics();
        int result=obj.add(a:10,b:20);
        System.out.println(result);
    }
}

