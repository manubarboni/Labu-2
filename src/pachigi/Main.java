package pachigi;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String nume_fis= "judete_in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        int i;
        String[] text = new String[42];
        for(i=0;i<42;i++)
        {
            text[i]=flux_in.readLine();
        }
        System.out.println("Introduceti judetul: ");
        Scanner scanner=new Scanner(System.in);
        String judet = new String(scanner.nextLine());
        Arrays.sort(text);
        System.out.println(Arrays.binarySearch(text,judet));
    }
}