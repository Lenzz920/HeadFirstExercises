package Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class RiskyCalls {

    public static void main(String[] args) throws InterruptedException {

        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Can't do that");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interruption");
        }

        Thread.sleep(100);

        try {
            String text = Files.readString(Path.of("data.json"));
        } catch (NoSuchFileException e) {
            System.out.println("no such file");
        } catch (IOException e) {
            System.out.println("this file was not found");
        } finally {
            System.out.println("finished");
        }


    }


}
