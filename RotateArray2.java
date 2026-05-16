import java.util.*;
class RotateArray2
{
    public static void rotate(int[] arr , int d)
    {
        d%=arr.length; //d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        
        for(int x: arr) System.out.print(x+" ");
    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4};
       System.out.print("Enter the length you want to rotate:");
       Scanner sc=new Scanner(System.in);
       int d=sc.nextInt();
       rotate(arr,d);
    }
}