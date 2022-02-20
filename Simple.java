package simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Simple {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("input.txt");
            br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line.trim());
                
                File file = new File("Dorothy.txt");
                if (!file.exists()) {
                    file.createNewFile();
                    FileWriter info = new FileWriter("Dorothy.txt");
                    info.write(line  + " "  + '\n');
                    info.close();
                } else {
                    FileWriter info = new FileWriter("Dorothy.txt",true);
                    info.write(line + " "  + '\n');
                    info.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

}
