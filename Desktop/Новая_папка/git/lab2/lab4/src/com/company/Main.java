
package com.company;


import java.io.*;
import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("/Users/anastasiatrofimcik/Desktop/универсиага/lab4/src/com/company/input.rtf"));
        String str;
        StringBuilder sb = new StringBuilder();
        FileWriter writer = new FileWriter("/Users/anastasiatrofimcik/Desktop/универсиага/lab4/src/com/company/output.rtf");
        while (in.hasNext()) {
            str = in.nextLine();
            sb.append(str);
            sb.append("\n");
        }
        var value = new EditText();
        writer.write(value.deleteComment(sb).toString());
        writer.close();
    }

}


