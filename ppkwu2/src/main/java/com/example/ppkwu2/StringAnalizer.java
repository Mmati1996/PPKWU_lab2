package com.example.ppkwu2;

public class StringAnalizer {
    private String string;
    private int upper;
    private int lower;
    private int digits;
    private int special;

    public StringAnalizer(String string) {
        this.string = string;
        this.upper = 0;
        this.lower = 0;
        this.digits = 0;
        this.special = 0;
    }
}
