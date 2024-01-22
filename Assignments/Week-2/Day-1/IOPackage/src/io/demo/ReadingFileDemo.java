package io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFileDemo {

    public static void main(String[] args) {
        FileInputStream fd = null;
        FileWriter fw = null;

        try {
            fd = new FileInputStream("resources/Input.txt");
            fw = new FileWriter("resources/Output.txt");

            int n = 0;
            while ((n = fd.read()) != -1) {
                System.out.print((char) n);
                fw.write(n);
            } fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fd != null) {
                    fd.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
