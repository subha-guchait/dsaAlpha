import java.util.ArrayList;

public class intro {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // add operation -- O(1)
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(16);
        System.out.println(list);

        // add operation diffrent type
        list.add(1, 7);
        System.out.println(list);

        // get operation -- O(1)
        System.out.println(list.get(3));

        // Remove -- O(n)
        list.remove(2);
        System.out.println(list);

        // set -- O(n)
        list.set(1, 5);
        System.out.println(list);

        // contains -- O(n)
        System.out.println(list.contains(6));
        System.out.println(list.contains(8));

        // size
        System.out.println(list.size());

        // print ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // print Reverse of an ArrayList--- O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // find maximum in an ArrayList---- O(n)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

        // swap index 1 and index 3
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);

    }

    // swap function
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

}