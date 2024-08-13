public class BubbleSort2 {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

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

