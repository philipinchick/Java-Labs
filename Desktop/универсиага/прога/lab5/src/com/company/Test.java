package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {


    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("/Users/anastasiatrofimcik/Desktop/универсиага/прога/lab5/input.rtf");
        Scanner scan = new Scanner(fr);
        String text = "";
        while (scan.hasNext()) {
            text += scan.nextLine();
        }

        Pattern pattern = Pattern.compile("(<.*?>)");
        Matcher matcher = pattern.matcher(text);
        Vector<String> result = new Vector<>();
        Vector<Integer> to_save = new Vector<>();
        to_save.add(0);
        while (matcher.find()) {
            result.add(text.substring(matcher.start(), matcher.end()));
            to_save.add(matcher.start());
            to_save.add(matcher.end());
        }
        to_save.add(text.length());
        
        SortByLength comparator = new SortByLength();
        result.sort(comparator);
        System.out.println(result);
    }

}

class SortByLength implements Comparator<String> {
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

