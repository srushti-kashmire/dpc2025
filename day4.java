import java.util.Scanner;
import java.util.Arrays;
class codec{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter size n");
    int n=sc.nextInt();
    int arr1[]=new int[n];
    System.out.println("Enter elements of arr1");
    for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

     System.out.println("Enter size m");
    int m=sc.nextInt();
    int arr2[]=new int[m];
    System.out.println("Enter elements of arr2");
    for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
    mergeandsort(arr1, arr2);
  System.out.println("Arrays after sorting and merging");
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    }
    //first array's bigger compare with 2nd's smaller and swap
    public static void mergeandsort(int arr1[],int arr2[]){
    int i,j;
    int n=arr1.length;
    int m=arr2.length;
    i=n-1;  
    j=0;
    while(i>=0 && j<m){
    if(arr1[i]>arr2[j]){
    int temp=arr1[i];
    arr1[i]=arr2[j];
    arr2[j]=temp;
    }
    i--;
    j++;
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    }}
