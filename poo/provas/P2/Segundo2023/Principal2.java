package poo.provas.P2.Segundo2023;

import java.util.Scanner;

public class Principal2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        try
        {
            Utils.verifica(frase);

            System.out.println(Utils.moderar(frase));
        } catch (TextoCurtoException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
