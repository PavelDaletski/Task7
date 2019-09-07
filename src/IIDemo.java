
       /* Создать и заполнить файл случайными целыми числами.
        Отсортировать содержимое файла по возрастанию.
        По итогу получить файл с отсортированным массивом чисел*/

import java.io.*;
import java.util.Arrays;

public class IIDemo {
    public static void main(String[] args) throws IOException {

        int MyArray[] = new int[]{1, 23, 34, 324, 21, 38, -1, 87, -67, 7};
        Arrays.sort(MyArray);
        String MyArrayString = Arrays.toString(MyArray);

        FileWriter fileWriter = new FileWriter("test3.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(MyArrayString);
        printWriter.close();

        System.out.println(Arrays.toString(MyArray));

    }

}
