import java.util.ArrayList;
import java.util.List;

/**
 * Created by nineleaps on 13/3/17.
 */




// class which converts a string into 3 letter words and converts each word to binary
public class SampleTestJava {

    private static ArrayList<String> values;
    private static String stringToConvert = "kms82jjs209mdm92jd39d";
    private static int j = 3;
    private static String firstValue;

    public static void main(String args[]) {

        splitFunction(stringToConvert);
        printArrayListValues(values);
        convertBinary(values);

    }

    private static void convertBinary(ArrayList<String> values) {
        String temp;
        byte[] bytes;
        int val;
        StringBuilder binary = new StringBuilder();


        for (int j = 0; j < values.size(); j++) {


            temp = values.get(j);
            bytes = values.get(j).getBytes();

            for (byte b : bytes) {
                val = b;
                for (int i = 0; i < 8; i++) {
                    binary.append((val & 128) == 0 ? 0 : 1);
                    val <<= 1;
                }
                binary.append("");

            }
            System.out.println(temp + ":" + binary);
        }
    }


    private static void printArrayListValues(ArrayList<String> values) {
        for (int i = 0; i < values.size(); i++) {
            firstValue = values.get(i);
            System.out.println(firstValue);
        }

    }

    private static void splitFunction(String stringToConvert) {
        values = new ArrayList<>();
        for (int i = 0; i < stringToConvert.length(); i = i + 3) {
            values.add(stringToConvert.substring(i, j));
            j = j + 3;
        }

        //printing  array list values


    }
}
