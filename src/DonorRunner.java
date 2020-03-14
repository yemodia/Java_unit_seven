import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {
    public static ArrayList<Donor> readFile() throws FileNotFoundException {
        ArrayList<Donor> donors = new ArrayList<>();
        Scanner scan = new Scanner(new File("donors.txt"));
        while(scan.hasNext()){
            String input = scan.nextLine();
            String name = input.substring(0, input.indexOf(" "));
            String runner = input.substring(input.indexOf(" "));
            double total = Double.parseDouble(runner);
            donors.add(new Donor(total, name));
        }
        return donors;
    }

    public static void donorSort(ArrayList<Donor> list){
        for (int next = 0; next < list.size() - 1; next --){}
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(readFile());
    }
}