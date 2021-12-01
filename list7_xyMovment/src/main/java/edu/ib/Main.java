package edu.ib;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void exportData(String path, ArrayList<Point> points){
        File file = new File(path);
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = {"iteration", "x", "y", "length"};
            writer.writeNext(header);

            // add data to csv
            String[] data1 = {"Aman", "10", "620"};
            for (Point point : points) {
                String[] data = {Integer.toString(point.getI()), Integer.toString(point.getX()),
                        Integer.toString(point.getY()), Double.toString(point.getLength())};
                writer.writeNext(data);
            }

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();

        for (int k= 0; k<100; k++){
            Point point = new Point();
            int i = 0;
            while (point.getLength() < 100){
                point.randomMovment2D();
                i++;
            }
            point.setI(i);
            points.add(point);
//            String data = i + "," + point.getX() + "," + point.getY() + "," + point.getLength();

//        System.out.println("Po " + i + " iteracji punkt znalazl sie na wspolrzednych " + point.toString() +
//                " w odleglosci " + point.getLength() + " od miejsca poczatkowego");
        }
        exportData("/home/arek/Dokumenty/inzynieria_biomedyczna/sem5/L_zaw_prog_obiekt/list7_xyMovment/data.csv", points);


    }
}
