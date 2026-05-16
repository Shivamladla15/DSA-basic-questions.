class MissingNumber
{
    public static int FindNumber(int arr[]) {
        int max=arr.length+1,missing=0;
        while(max>=1)
        {
            //System.out.print(max);
            for(int i=0;i<arr.length;i++){
                if(max==arr[i]) break;
                else if(max != arr[i] && i==arr.length-1){
                    missing=max;
                    //break;
                } 
            }
            max--;
        }
       return missing;
    }
   public static void main(String[] args) {
       int arr[]={1,5,4,2};
       //findnumber(arr);
       System.out.print("Missing number:"+ FindNumber(arr));
   }

}