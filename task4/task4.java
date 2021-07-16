import java.io.*;
import java.util.*;

public class task4 {

    public static void main(String[] args) throws FileNotFoundException {

        int average = 0;
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        File file1 = new File("file1");
        Scanner scannerFile = new Scanner(file1);
        try{
            String line = "";
            while ((line = scannerFile.nextLine()) != null) {
                arr.add(Integer.parseInt(line));

            }
        } catch (NoSuchElementException e) {
        }
        for (int num : arr) average += num;
        average = average/arr.size();
        ArrayList<Integer> difference = new ArrayList<Integer>();
        for (int num : arr) {
            difference.add(Math.abs(num-average));
        }
        int min = arr.get(difference.indexOf(Collections.min(difference)));
        for (int i : arr) {
            while (i != min){
                if (i < min){
                    i++;
                } else i--;
                result++;
            }
        }
        System.out.println(result);
        }
        }


