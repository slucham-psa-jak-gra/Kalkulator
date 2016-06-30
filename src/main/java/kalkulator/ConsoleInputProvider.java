package kalkulator;

import java.util.Scanner;

public final class ConsoleInputProvider implements InputProvider {
    private final Scanner scanner;

    public ConsoleInputProvider() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String next() {
        return scanner.nextLine();
    }
}
