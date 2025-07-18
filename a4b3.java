import java.util.*;
public class a4b3{
public static void main(String args[])
{
    String a="a3b4c2";
    int i=0;
    


    while(i<a.length()){
        char c=a.charAt(i++);
        StringBuilder count=new StringBuilder();
        while(i<a.length()  &&  Character.isDigit(a.charAt(i))){
            count.append(a.charAt(i++));
        }
        int num=Integer.parseInt(count.toString());

        for(int j=0;j<num;j++){
            System.out.print(c);
        }
    }
}

}