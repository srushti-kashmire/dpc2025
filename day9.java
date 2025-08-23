import java.util.Scanner;
public class findprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of strings in your array");
        int n=sc.nextInt();
    String[] str=new String[n];
    for (int i=0;i<n;i++){
    str[i]=sc.next();
    }
    System.out.println(pref(str));
    }
public static String pref(String str[]){
String cmp=str[0];
int prefixlength=0;
if(str.length==1){
    return str[0];
}

for(int i=1;i<str.length;i++){
int j=0;
prefixlength=0;
while(j<cmp.length() && j<str[i].length() && cmp.charAt(j)==str[i].charAt(j)){
j++;
prefixlength=j;
}
if (cmp.isEmpty()) {
    break;
}

cmp=cmp.substring(0,prefixlength);
}
return cmp;
}
}
