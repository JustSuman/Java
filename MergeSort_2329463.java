import java.util.ArrayList;

public class MergeSort_2329463 {

  public static void mergeSort(ArrayList<Integer> list) {
    if (list.size() > 1) {

      ArrayList<Integer> firstHalf = new ArrayList<>(list.subList(0, list.size() / 2));
      ArrayList<Integer> secondHalf = new ArrayList<>(list.subList(list.size() / 2, list.size()));

      mergeSort(firstHalf);
      mergeSort(secondHalf);

      merge(list, firstHalf, secondHalf);
    }
  }

  private static void merge(ArrayList<Integer> list, ArrayList<Integer> firstHalf, ArrayList<Integer> secondHalf) {

    int firstIndex = 0;
    int secondIndex = 0;
    int listIndex = 0;

    while (firstIndex < firstHalf.size() && secondIndex < secondHalf.size()) {
      if (firstHalf.get(firstIndex) < secondHalf.get(secondIndex)) {
        list.set(listIndex, firstHalf.get(firstIndex));
        firstIndex++;
      } else {
        list.set(listIndex, secondHalf.get(secondIndex));
        secondIndex++;
      }
      listIndex++;
    }

    ArrayList<Integer> remainingList = (firstIndex < firstHalf.size()) ? firstHalf : secondHalf;
    int remainingIndex = (firstIndex < firstHalf.size()) ? firstIndex : secondIndex;
    while (listIndex < list.size()) {
      list.set(listIndex, remainingList.get(remainingIndex));
      listIndex++;
      remainingIndex++;
    }
  }

  public static void main(String[] arg) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(5);
    list1.add(1);
    list1.add(3);
    list1.add(2);
    list1.add(4);
    MergeSort_2329463.mergeSort(list1);
    System.out.println(list1);
  }
}
