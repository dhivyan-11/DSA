import java.util.*;

public class checktriangle{
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix");
        int n = sc.nextInt();
        int[][] matrix=new int[n][n];

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        boolean isUpper = true,isLower = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j && matrix[i][j] !=0){
                    isLower=false;
                }
                if(i>j && matrix[i][j] !=0){
                    isUpper=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        if(isUpper){
            System.out.println("Upper triangle");
        }
        else if(isLower){
            System.out.println("lower traingle");

        }
        else{
            System.out.println("neither");
        }
            sc.close();
    }
}