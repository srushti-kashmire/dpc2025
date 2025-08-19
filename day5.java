import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class codec {
public static void main(String[] args) {
ArrayList<Integer>leaders=findleader();
System.out.println(leaders);
}
static ArrayList<Integer> findleader(){
Scanner sc=new Scanner (System.in);
System.out.println("enter length of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
ArrayList<Integer>list=new ArrayList<>();
int leader1=arr[n-1];
list.add(leader1);
for(int i=n-2;i>=0;i--){
if(arr[i]>leader1){
list.add(arr[i]);
leader1=arr[i];
}
}
Collections.reverse(list);
System.out.print("Arrays of leaders:");
return list;
}
}


