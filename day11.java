import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class permutation {
   public static void main(String[] args) {
    Set<String> results=new HashSet<>();
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
   findPermutations(s.toCharArray(), 0,results);
   for (String str : results) {
    System.out.println(str);
   }
   } 
   public static void Swap(char chars[],int i,int fi){
   char temp=chars[i];
   chars[i]=chars[fi];
   chars[fi]=temp;
   }
   public static void findPermutations(char[] chars,int fi,Set <String>results){
    if(fi==chars.length-1){//base condition
    results.add(new String(chars));
    return;
    }
    for(int i=fi;i<chars.length;i++){
    Swap(chars,i,fi);
    findPermutations(chars, fi+1,results);
    Swap(chars,i,fi);
    }
   }
}
