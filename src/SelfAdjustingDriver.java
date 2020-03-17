import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(14);
        list1.add(8);
        list1.add(2);
        list1.add(0);
        SelfAdjusting one = new SelfAdjusting(list1);
        System.out.println("Input: " + one.getList());
        one.adjustList();
        System.out.println("Output: " + one.getList());
        System.out.println();


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(14);
        list2.add(11);
        list2.add(8);
        list2.add(13);
        list2.add(0);
        SelfAdjusting two = new SelfAdjusting(list2);
        System.out.println("Input: " + two.getList());
        two.adjustList();
        System.out.println("Output: " + two.getList());
    }
}