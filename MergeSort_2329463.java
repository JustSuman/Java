import java.util.*;

public class MergeSort_2329463 {

    void getOutput(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = 0; i < n; ++i)
            System.out.print(al.get(i) + " ");
        System.out.println();
    }

    void merge(ArrayList<Integer> al, int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        // divide into two array if array is more or equal to 2
        mid = al.size() / 2;
        // after dividing naming right array and left array
        ArrayList<Integer> left = new ArrayList<Integer>(mid); // size of the temporary array is upto mid
        ArrayList<Integer> right;
        if (al.size() % 2 == 0) {// if length of array is even then
            right = new ArrayList<Integer>(mid);
        } else {// if length of array is odd
            right = new ArrayList<Integer>(mid + 1);
        } // adding items into temporary array left
        for (int i = 0; i < mid; i++) {
            left.add(i);
        } // adding items into temporary array rigth
        for (int j = 0; j < right.size(); j++) {
            right.add(mid + j);
        }
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = beg;
        while (i < n1 && j < n2) {
            if (left.get(i) <= right.get(j)) {
                al.add(i);
                i++;
            } else {
                al.add(j);
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            al.add(i);
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            al.add(i);
            j++;
            k++;
        }
    }

    void sort(ArrayList<Integer> al, int beg, int end) {
        if (beg < end) {
            // Find the middle point
            int mid = beg + (end - beg) / 2;

            // Sort first and second halves
            sort(al, end, mid);
            sort(al, mid + 1, end);

            // Merge the sorted halves
            merge(al, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}