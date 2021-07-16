import java.io.*;
import java.util.*;

public class task2 {

    public static void main(String[] args) {
        String result ="";

        try {
            File file1 = new File("file1");

            Scanner scannerFirstFile = new Scanner(file1);
            float circleX = scannerFirstFile.nextInt();
            float circleY = scannerFirstFile.nextInt();
            float radius = scannerFirstFile.nextInt();
            scannerFirstFile.close();
            try {
                File file2 = new File("file2");
                Scanner scannerSecondFile = new Scanner(file2);
                String line = "";
                try {
                    while ((line = scannerSecondFile.nextLine()) != null) {
                        float coordX = Float.parseFloat(line.split(" ")[0]);
                        float coordY = Float.parseFloat(line.split(" ")[1]);
                        if (Math.pow((coordX-circleX),2)+Math.pow((coordY-circleY),2) < Math.pow(radius,2)){
                            result += "1\n";
                        } else if (Math.pow((coordX-circleX),2)+Math.pow((coordY-circleY),2) == Math.pow(radius,2)) {
                            result += "0\n";
                        } else {
                            result += "2\n";
                        }
                    }
                    scannerSecondFile.close();
                } catch (NoSuchElementException ex) {
                }
            }
            catch (IOException e) {
                System.out.println("FileNotFoundException");
            }
        }
           catch (IOException e){
                System.out.println("FileNotFoundException");
           }
        System.out.print(result);
    }
}
