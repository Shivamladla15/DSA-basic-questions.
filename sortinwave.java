class sortinwave
{
    public static void wave(int arr[]){
        int i=0,j=i+1,temp;
        while(j<arr.length)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j=i+1;
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1};//Always a sorted array
        wave(arr);
    }
}