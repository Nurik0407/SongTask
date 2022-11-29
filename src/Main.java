import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            Song song = new Song("Another Love", "Tom Odell", "I wanna take you somewhere so you know I care\n" +
                    "But it's so cold and I don't know where\n" +
                    "I brought you daffodils on a pretty string\n" +
                    "But they won't flower like they did last spring");

            FileWriter fileWriter = new FileWriter("Song.txt");
            fileWriter.write("name of the song:      " + song.getTitle());
            fileWriter.write("\nauthor's name:      " + song.getAuthor());
            fileWriter.write("\ntexts song:  \n\n" + song.getText());
            fileWriter.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("Song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }
    }
}