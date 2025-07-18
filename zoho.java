public class zoho{
public static void main(String args[]){
    int arr[]={7,2,3,9,8,6};
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            for(int j=0;j<arr.length;j++){
                if(arr[j]%2!=0 && arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            for(int j=0;j<arr.length;j++){
                if(arr[j]%2==0 && arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    for(int i=0;i<arr.length;i++){
                 System.out.print(arr[i]);}
}}