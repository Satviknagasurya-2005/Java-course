public class Five {
    public String addTwoNumbers(String num1, String num2){
        String num3=num1+num2;
        return num3;
    }
    public static void main(String[] args){
        Five obj=new Five();
        System.out.println(obj.addTwoNumbers("str","sst"));
    }
}