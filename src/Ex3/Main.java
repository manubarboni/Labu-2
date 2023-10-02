package Ex3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti stringul mare: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        System.out.println("Introduceti stringul mic: ");
        String s= new String(scanner.nextLine());
        sb.insert(1,s);
        sb.delete(8,12);
        System.out.println(sb);
    }
}
