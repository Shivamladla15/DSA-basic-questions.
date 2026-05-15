class averageofarray
{
    public static void main(String args[])
    {
        int arr[]={12,25,85,95,15,47,63,28,51};
        int sum=0;
        float avg;
        
        for(int x:arr) sum+=x;
        avg=sum/(float)arr.length;
        System.out.print("\nSum of element: "+sum);
        System.out.print("\nAverage of element: "+avg);
    }
}