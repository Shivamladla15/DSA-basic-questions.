
import java.util.*;

class maxminarray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " + size + " element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tempmax = arr[0], tempmin = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (tempmax < arr[j]) {
                tempmax = arr[j]; 
            }else if (tempmin > arr[j]) {
                tempmin = arr[j];
            }
        }
        System.out.print("Largest element in array: " + tempmax);
        System.out.print("\nSmallest element in array: " + tempmin);
        System.out.print("\nDIffrence between largest and smallest element in array: " + (tempmax - tempmin));
    }
}
