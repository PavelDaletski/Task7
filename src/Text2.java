import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.Optional;

public class Text2 {
    public static void main(String[] args) throws IOException {
        String fillName = "2.txt";
        String content = String.valueOf(Files.lines(Paths.get(fillName)).reduce((a, b)-> a + "\n" + b ));
        //System.out.println(content);





        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);


        int sentences  = count(iterator, content);
        System.out.println("Всего предложений:" + sentences);

    }
    private  static  int count(BreakIterator bi, String sources){
        int counter = 0;
        bi.setText(sources);

        int lastIndex = bi.first();
        while (lastIndex !=BreakIterator.DONE){
            int fistrIndex = lastIndex;
            lastIndex = bi.next();

            if (lastIndex != BreakIterator.DONE){
                String setence = sources.substring(fistrIndex, lastIndex);
                System.out.println("предложение =" + setence);
                counter++;

            }
        }
        return counter;





    }
}
