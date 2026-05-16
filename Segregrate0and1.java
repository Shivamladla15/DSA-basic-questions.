class Segregrate0and1
{
    public static void segregate(int[] arr) 
    {
        int count0=0,count1=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==0) count0++;
            else count1++;
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<arr.length;i++)  arr[i]=1;
        for(int x: arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0};
        segregate(arr);
    }
}