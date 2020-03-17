import java.awt.*;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangle() throws IOException {
        Scanner scan = new Scanner(new File("Rectangle.txt"));
        ArrayList<Rectangle> recList = new ArrayList<Rectangle>();
        while (scan.hasNext()) {
            Rectangle rec = new Rectangle(scan.nextDouble(), scan.nextDouble());
            recList.add(rec);
        }
        return recList;
    }

    public static double findAverage(ArrayList<Rectangle> rectangles) {
        double total = 0.0;
        int num = 0;
        for (int i = 0; i < rectangles.size(); i++) {
            total += (rectangles.get(i)).area();
            num++;
        }
        double average = total/num;
        return average;
    }

    public static void main(String[] args) throws IOException {
        findAverage(getRectangle());

    }
}
