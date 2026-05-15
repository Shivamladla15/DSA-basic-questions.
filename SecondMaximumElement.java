
class SecondMaximumElement {

    public static void main(String[] args) {
        int arr[] = {12, 45, 85, 14, 32, 65, 76};
        int max = arr[0];
        int smax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.err.println("Maximum element in array:" + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.print("Second maximum in array: " + smax);
    }
}
