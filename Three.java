
public class Three {
    public int[] arr(){
        int arrStr[]={44,33,55,22,77};
        return arrStr;    
    }
    public static void main(String[] args){
        Three obj=new Three();
        int[]b=obj.arr();
        System.out.println(b[0]);
    }
}