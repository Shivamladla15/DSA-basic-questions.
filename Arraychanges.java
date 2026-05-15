//Multiply odd indexes element by 2 and add 10 for even indexes element.

class Arraychanges {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
