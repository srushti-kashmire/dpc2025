import java.util.Scanner;
public class codec {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter no of elements you want in an array");
    int n=sc.nextInt();
    int arr[]=new int[n-1]; 
    for(int i=0;i<n-1;i++){
     arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
    System.out.println(arr[i] );
    }
    if(arr[0]!=1){
        System.out.println("missing element is:1");
        return;
    }
    for(int i=0;i<n-2;i++){
if (arr[i+1]!=arr[i]+1){
   System.out.println("missing ellement is:"+(arr[i]+1));
   return;
        }
    }
    System.out.println("missing element is:"+n);
    return;
    }}


