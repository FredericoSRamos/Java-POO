package poo.provas.Primeiro2018;

import java.util.Scanner;

public class Substitui {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String palavra = sc.nextLine ();

        System.out.println (processa (palavra));

        sc.close ();
    }

    public static String processa (String str)
    {
        str = str.toUpperCase().replace('A', '4').replace('E', '3').replace('I', '1').replace('O', '0');
        char[] charArr = str.toCharArray ();

        for (int i = 0, j = charArr.length - 1; i < j; i++, j--)
        {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }

        return new String (charArr);
    }
}
