import java.util.Scanner;
public class day8 {
public static void main(String[] args) {
reverse();
}
//day 8
public static void reverse(){
Scanner sc=new Scanner(System.in);
System.out.println("enter input");
String s=sc.nextLine();
String result="";
int i=0;
int n=s.length();
while(i<n ){ 
while(i<n && s.charAt(i)==' '){
i++;
}
if(i>=n){
break;
}
int j=i;
while(j<n && s.charAt(j)!=' '){
j++;
}
String sub=s.substring(i, j);
if(result.length()==0){
result=sub;
}else{
result= sub+" "+result;
}
i=j;
}
System.out.println(result);
}
}
