package com.company;

import java.io.IOException;

class EditText {
    public StringBuilder deleteComment(StringBuilder sb) {

        StringBuilder newSb = new StringBuilder();
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == '/' && sb.charAt(i + 1) == '/') {
                while (sb.charAt(i) != '\n') {
                    i++;
                }
            }
            if (sb.charAt(i) == '/' && sb.charAt(i + 1) == '*') {
                while (sb.charAt(i) != '*' || sb.charAt(i + 1) != '/') {
                    i++;
                }
                i+=2;
            }
            int count = 0;
            if (sb.charAt(i) == '"') {
                newSb.append(sb.charAt(i));
                i++;
                while (i < sb.length()) {
                    if (sb.charAt(i) == '"' && count % 2 == 0) {
                        break;
                    }
                    if (sb.charAt(i) == '\\') {
                        count++;
                    }
                    else count = 0;
                    newSb.append(sb.charAt(i));
                    i++;
                }
                newSb.append(sb.charAt(i));
                i++;
            }
            if (sb.charAt(i) == '\'') {
                while (i + 1 < sb.length() && sb.charAt(i + 1) != '\'') {
                    newSb.append(sb.charAt(i));
                    i++;
                }
                newSb.append(sb.charAt(i));
                i++;
            }
            newSb.append(sb.charAt(i));
        }
        return (newSb);
    }
}