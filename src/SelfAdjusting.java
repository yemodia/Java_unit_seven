import java.util.ArrayList;

/**
 * @author Yerim Dia
 * @since 3/17/2020
 * The method searches for a number through a list and moves it to the front of the list
 */

public class SelfAdjusting {

    private ArrayList<Integer> list;

    /**
     * Constructor that initializes list
     * @param list
     */
    public SelfAdjusting(ArrayList<Integer> list){
        this.list = list;
    }

    /**
     * Outputs the list
     * @return list
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     * An arrayList with numbers two to twenty is created
     *Number input is searched for through the list
     * If the number is in the list, it removes it and places it at the front
     * If the number is not in the list, it places it at the front
     *
     */
    public void adjustList(){
        ArrayList<Integer> finalArray = new ArrayList<>();
        list.remove(list.size()-1);
        for (int i = 2; i <= 20; i += 2){
            finalArray.add(i);
        }
        boolean check = false;
        int checkNum = 0;
        for (int i = 0; i < list.size(); i++) {
            checkNum = list.get(i);
            for (int x = 0; x < finalArray.size(); x++) {
                if (checkNum == finalArray.get(x)) {
                    finalArray.remove(x);
                    finalArray.add(0, checkNum);
                    check = true;
                }
            }
            if (!check) {
                finalArray.add(0, checkNum);
            }
            check = false;
        }
        list = finalArray;
    }
}