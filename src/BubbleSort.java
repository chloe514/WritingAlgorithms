public class BubbleSort {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {4, 1, 3, 9, 7};

        bubblesort(arr, N);

        // Printing the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubblesort(int arr[], int N) {
        for (int i = 0; i < N - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}

