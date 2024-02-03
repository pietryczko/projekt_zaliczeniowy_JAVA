package org.example.Service;

import java.util.Scanner;

public class ScannerSingleton {
    private static Scanner scanner;

    private ScannerSingleton() {
        scanner = new Scanner(System.in);
    }

    public static Scanner getInstance() {
        if (scanner == null) {
            new ScannerSingleton();
        }
        return scanner;
    }
}