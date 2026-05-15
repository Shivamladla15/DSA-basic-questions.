import java.util.*;
class countelement
{
    public static void main (String args[])
    {
        int arr[]={78,58,36,2,5,45,89,95,78,9,7,98,99,415,25,89,25,89,45,45};
        int trg;
        Scanner sc= new Scanner(System.in);          
        System.out.print("Enter element to find:");
        trg=sc.nextInt();
        int count=0;
        for(int x: arr)
        {
            if(x==trg)
            count++;
        }
        if(count>0)
        System.out.print("Element Found "+count+" Times in the array.");
        else
        System.out.print("Element Not found.");
    }
}