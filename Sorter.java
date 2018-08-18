import java.util.LinkedList;
import java.util.List;

public class Sorter {

    public static void main(String[] args){

        String a = "B";
        String b = "#1";
        String c = "#6";
        String d = "#5";
        String e = "C";

        List<String> lList = new LinkedList<>();

        lList.add(a);
        lList.add(b);
        lList.add(c);
        lList.add(d);
        lList.add(e);

        System.out.println("Unsorted Linked list = "+ lList);

        // Iterate the unsorted list one by one
        for (int i = 1; i < lList.size()-1; i++) {

            // Find the minimum element in unsorted list
            int min = i;

            for (int j = i + 1; j <= lList.size()-1; j++) {

                if (lList.get(j).compareTo(lList.get(min)) < 0) {
                    min = j;

                }
            }

            // Swap the minimum element with the first element of the string list
            String temp = lList.get(min);
            lList.set(min,lList.get(i));
            lList.set(i,temp);

        }
        System.out.println("Sorted Linked list = "+ lList);
    }
}
