import java.util.*;
class RotateArray
{
    public static void rotate(int[] arr , int d)
    {
        int i=0 ,temp;
        d=d%arr.length;
        while(i<d)
        {
            temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
              arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
            i++;
        }
        for(int x: arr) System.out.print(x+" ");
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4};
       System.out.print("Enter the length you want to rotate:");
       Scanner sc=new Scanner(System.in);
       int d=sc.nextInt();
       rotate(arr,d);
    }
}