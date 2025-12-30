public class Four {
    public int addTwoNumbers(int num1,int num2){
        int num3=num1+num2;
        return num3;
    }

    public static void main(String[] args){
        Four f=new Four();
        int num4=f.addTwoNumbers(10,20);
        System.out.println(num4);
    }
}