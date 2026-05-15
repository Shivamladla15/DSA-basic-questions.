
class countoddeven {

    public static void main(String args[]) {
        int arr[] = {51, 58, 69, 35, 31, 54, 47};
        int odd = 0, even = 0;
        for (int x : arr) {
            System.out.print(x + " ");
            if (x % 2 == 0) {
                even++; 
            }else {
                odd++;
            }
        }
        System.out.println("\nNo of ODD no in array: " + odd);
        System.out.println("No of Even no in array: " + even);
    }
}
