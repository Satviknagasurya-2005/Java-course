public class ArrayDemo{
    public static void main(String[] args) {
        int [][] matrix ={
        {3,5,6},
        {4,6,8}
    };
    for(int i =0; i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.println(matrix[i][j]+" ");
        }
        System.out.println();
    }
        
    }
    
}