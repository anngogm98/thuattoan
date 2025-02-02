package org.example.thuattoan.search;

public class sentinel_linear_search {
    static void sentinelSearch(int arr[], int n, int key)
    {

        // Last element of the array
        int last = arr[n - 1];

        // Element to be searched is
        // placed at the last index
        arr[n - 1] = key;
        int i = 0;

        while (arr[i] != key)
            i++;

        // Put the last element back
        arr[n - 1] = last;

        if ((i < n - 1) || (arr[n - 1] == key))
            System.out.println(key + " is present at index "
                    + i);
        else
            System.out.println("Element Not found");
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr
                = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
        int n = arr.length;
        int key = 180;

        sentinelSearch(arr, n, key);
    }
}
