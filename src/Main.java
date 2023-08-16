
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 10;

        int[] arr = getRandomArray(size);
        System.out.println("Массив: " + arrayToString(arr));
        arr = sortArray(arr);
        List<Integer> arrayList = getRandomArrayList(size);
        System.out.println("ArrayList: " + listToString(arrayList));
        arrayList = sortList(arrayList);
        List<Integer> linkedList = getRandomLinkedList(size);
        System.out.println("LinkedList: " + listToString(linkedList));
        linkedList = sortList(linkedList);
    }
    public static int[] getRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 2);
        }
        return arr;
    }

    public static List<Integer> getRandomArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 2));
        }
        return arrayList;
    }

    public static List<Integer> getRandomLinkedList(int size) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add((int) (Math.random() * 2));
        }
        return linkedList;
    }

    public static int[] sortArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static List<Integer> sortList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
            sb.append(" ");
        }
        return sb.toString();
    }
}