public class stringexpression {
    public static int expression(String s){
        int n=s.length();
        int numcount=(n+1)/2;
        int[] num=new int[numcount];
        char[] op=new char[n-numcount];

        for(int i=0;i<numcount;i++){
            num[i]=s.charAt(i )- '0';
        }

        for (int i=0;i<n-numcount;i++){
            op[i]=s.charAt(numcount+i);
        }

        int result=num[0];

        for(int i=0;i<op.length;i++){
            int next=num[i+1];
            char ops=op[i];

            result = switch (ops) {
                case '+' -> result + next;
                case '-' -> result - next;
                case '*' -> result * next;
                case '/' -> result / next;
                default -> throw new IllegalArgumentException("Invalid operator: " + ops);
            };

        }
        return result;
        

    }
    public static void main(String[] args) {
            String input="123457*+-++";
            System.out.println(expression(input));
    }
}