package academy.belhard;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file.txt")) {
            String text = "Lollybomb";
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String read;

            while ((read = reader.readLine()) != null){
                System.out.println(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
