import java.util.*;
class factorialarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter "+size+" Element of array: ");
        for (int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("----First Array----");
        for(int  x:arr)
        System.out.print(x+ " ");
        int arr2[]=new int[size];
        for(int j=0;j<arr.length;j++)
        {
            int fact=1;
            
                int n=arr[j];
                for(int i=1;i<=n;i++)
                {
                    fact*=i;
                }
            
            arr2[j]=fact;
        }
        System.out.println("\n----Factorial Array----");
        for(int x:arr2)
        System.out.print(x+" ");
    }
}