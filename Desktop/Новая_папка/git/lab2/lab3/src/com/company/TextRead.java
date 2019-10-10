package com.company;


import java.util.Scanner;
import java.util.Vector;

public class TextRead {

    public String TxtRead() {
        StringBuilder text = new StringBuilder();
        Scanner in = new Scanner(System.in);
        String line;
        System.out.println("Введите текст");
        while ((line = in.nextLine()).length() != 0) {
            text.append(line);
            text.append("\n");
        }
        return text.toString();
    }

}
