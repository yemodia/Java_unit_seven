import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates()throws IOException {
        Scanner file1 = new Scanner(new File("file1.txt"));
        Scanner file2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> f1 = new ArrayList<Integer>();
        ArrayList<Integer> f2 = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            f1.add(file1.nextInt());
        }
        for(int i=0;i<20;i++){
            f2.add(file2.nextInt());
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if(f1.get(i)==f2.get(j)){
                    ret.add(f2.get(j));
                }
            }
        }
        return ret;
    }
    public static ArrayList<String> fileDuplicatesTwo()throws IOException{
        Scanner scan = new Scanner(new File("names.txt"));
        String origin= scan.next();
        ArrayList<String> dup= new ArrayList<String>();
        int count=0;
        while(scan.hasNext()){

            dup.add(scan.next());

        }
        System.out.println(origin);
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                if(dup.get(i)==dup.get(j)){
                    dup.remove(i);
                    dup.remove(j);
                    i--;
                    j--;
                }
            }
        }
        return dup;
    }
    public static ArrayList<Integer> orderedList()throws IOException{
        Scanner file1 = new Scanner(new File("com/company/file1.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<20;i++){
            int cur=file1.nextInt();
            int x=i-1;
            int num=file1.nextInt();
            while(x>=0&&cur< num){
                list.set(x+1, num);
                x--;
            }
            list.set(x+1,cur);
        }
        return list;
    }
}
