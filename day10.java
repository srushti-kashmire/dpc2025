import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class dat10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
    String strs[]=new String[n];
    for(int i=0;i<strs.length;i++){
    strs[i]=sc.next();
    }
    List<List<String>> ans=anagrams(strs);
    System.out.println(ans);  
    }
    public static List<List<String>> anagrams(String strs[]){
     HashMap<String,List<String>> map=new LinkedHashMap<>(); 
    for(String c:strs){
    char[] chars=c.toCharArray();
    Arrays.sort(chars);
    String key=new String(chars);
    if(!map.containsKey(key)){
    map.put(key, new ArrayList<>());
    }
    map.get(key).add(c);
}
    return new ArrayList<>(map.values());
}
}
