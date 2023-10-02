package Pachet;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("cantec_in.txt"));
        PrintStream flux_out = new PrintStream("cantec_out.txt");
        while(scanner.hasNext()) {
           Vers vers = new Vers(scanner.nextLine());
           vers.toUpp();
           vers.addStar();
           vers.countWords();
           flux_out.println(vers.getVers());
        }


    }
}
