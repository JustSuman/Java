import java.util.*;

public class MergeSort_2329463 {
    void getInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        String input = scan.nextLine();
        scan.close();
        String[] splitter = input.split(" ");
        for (String a : splitter) {
            int i = Integer.parseInt(a);
            al.add(i);
        }
        System.out.println(al);
    }

    void getOutput(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = 0; i < n; ++i)
            System.out.print(al.get(i) + " ");
        System.out.println();
    }

    void merge(ArrayList<Integer> al, int beg, int mid, int end) {

        int n1 = mid - beg + 1;
        int n2 = end - mid;

        ArrayList<Integer> left = new ArrayList<Integer>(n1);
        ArrayList<Integer> right = new ArrayList<>(n2);

        for (int i = 0; i < n1; ++i) {
            left.add(i, al.get(beg + i));
        }
        for (int j = 0; j < n2; ++j) {
            right.add(j, al.get(mid + 1 + j));
        }

        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = beg;
        while (i < n1 && j < n2) {
            if (left.get(i) <= right.get(j)) {
                al.add(k, i);
                i++;
            } else {
                al.add(k, j);
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            al.add(k, i);
            i++;
            k++;
        }

        /* Copy remaining elements of Right arraylist if any */
        while (j < n2) {
            al.add(k, j);
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
        ArrayList<Integer> al = new ArrayList<Integer>();
        MergeSort_2329463 test = new MergeSort_2329463();
        test.getInput();
        test.sort(al, 0, al.size() - 1);
        System.out.println(al);
    }

}