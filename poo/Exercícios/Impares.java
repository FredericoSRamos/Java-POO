package poo.Exercícios;

public class Impares {
    public static void main (String[] args)
    {
        for (int i = 1; i < 10000; i += 2)
            System.out.println (i);

        int temp = 0;
        for (int i = 0; i < 50001; i++)
        {
            temp += i;
            if (i > 100 && i < 137)
                temp -= i;
        }
        System.out.println (temp);
    }
}
