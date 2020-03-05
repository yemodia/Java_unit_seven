import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> getStates(){



        ArrayList<String>userStates = new ArrayList<>();

        while(true){
            System.out.println("Enter the name of a state or \\Stop\\ to quit:");
            String userInput = scan.next();

            if(userInput.equals("Stop")){
                break;
            }
            userStates.add(userInput);
        }
        return userStates;




    }

    public static String createList(ArrayList<String> states){
        String finalString = " ";
        for (String i: states){
             finalString += i +" ->";
        }
        return finalString;

    }
    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        Scanner scan = new Scanner(new File("data.txt"));

        ArrayList<Integer> numList = new ArrayList<>();
        scan.nextInt();

        int maxNum = numList.size()-1;
        int minNum = numList.get(0);


        while (scan.hasNextInt()){
            numList.add(scan.nextInt());
        }

        for(int i: numList){
            if (i < minNum)
                minNum = i;
            if (i > maxNum)
                maxNum = i;
        }


    }
}
