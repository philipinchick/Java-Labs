package com.company;

import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {

          TextRead txt = new TextRead();

          String text = txt.TxtRead();
          System.out.println();
          System.out.println(text);

          StringBuilder textB = new StringBuilder(text.subSequence(0, text.length()));
          textB.reverse();
          System.out.println();
          System.out.println(textB);

    }
}
