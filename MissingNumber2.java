class MissingNumber2
{
    public static int FindNumber(int arr[]) {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int sarray=0;
        for(int x: arr){
            sarray+=x;
        }
        return sum-sarray;
    }
   public static void main(String[] args) {
       int arr[]={1,5,4,2,3,6,8,10,7};
       //findnumber(arr);
       System.out.print("Missing number:"+ FindNumber(arr));
   }

}