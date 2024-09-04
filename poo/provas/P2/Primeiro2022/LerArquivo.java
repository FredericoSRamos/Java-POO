package poo.provas.P2.Primeiro2022;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LerArquivo
{
    public static Set<String> retornaStrings (String path)
    {
        Scanner scanner = new Scanner (path);
        Set<String> set = new HashSet<>();

        while (scanner.hasNext())
            set.add(scanner.next());

        scanner.close();

        return set;
    }
}