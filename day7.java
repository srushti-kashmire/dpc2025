import java.util.Scanner;
public class day7{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int height[]=new int[n];
for(int i=0;i<n;i++) height[i]=sc.nextInt();
System.out.println(trap(height));
    }
    public static int trap(int[] height){
int n=height.length,left=0,right=n-1,leftMax=0,rightMax=0,totalamt=0;
while(left<=right){
if(height[left]<height[right]){
if(height[left]>=leftMax){ 
  leftMax=height[left];
}
else 
{
totalamt+=leftMax-height[left];
left++;
}
}else{
if(height[right]>=rightMax) {
  rightMax=height[right];
}
else 
  {
totalamt+=rightMax-height[right];
 right--;
  }
  }}
  return totalamt;
    }
}
