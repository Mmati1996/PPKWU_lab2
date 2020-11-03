package com.example.ppkwu2;

import lombok.Data;

@Data
public class StringAnalizer {
    private String string;
    private int upper = 0;
    private int lower = 0;
    private int digits = 0;
    private int special = 0;

    public StringAnalizer(String string) {
        for (int i=0; i<string.length();i++){
            if (string.toCharArray()[i]>='A' && string.toCharArray()[i]<='Z')
                upper++;
            else if(string.toCharArray()[i]>='a'&&string.toCharArray()[i]<='z')
                lower++;
            else if (string.toCharArray()[i]>='0'&&string.toCharArray()[i]<='9')
                digits++;
            else
                special++;
        }
    }
}
