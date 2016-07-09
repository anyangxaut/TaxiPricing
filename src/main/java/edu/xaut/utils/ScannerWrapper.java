package edu.xaut.utils;

import java.util.Scanner;

public class ScannerWrapper {

    private Scanner scanner;

    public ScannerWrapper(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getValue() {
        return scanner.nextDouble();
    }
}
