import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.Locale;

public class Text3 {
    public static void main(String[] args) throws IOException {
        String fillName = "2.txt";
        String content = String.valueOf(Files.lines(Paths.get(fillName)).reduce((a, b)-> a + "\n" + b ));
        


        BreakIterator iterator = BreakIterator.getLineInstance(Locale.US);

        int sentences  = count(iterator, content);
        System.out.println("Всего слов:" + sentences);

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
                System.out.println("Слово "+setence);
                counter++;

            }
        }
        return counter;



    }
}

