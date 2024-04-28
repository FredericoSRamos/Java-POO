

import java.util.Scanner;

public class CharByChar {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String str = sc.nextLine ();

        charByChar (str);
        inverse (str);
        inverseBuilder (new StringBuilder (str));
        System.out.println (converteInt(str));

        sc.close ();
    }

    public static void charByChar (String str)
    {
        char[] arr = str.toCharArray ();

        for (char i : arr)
            System.out.println (i);
    }

    public static void inverse (String str)
    {
        char[] arr = str.toCharArray ();

        for (int i = arr.length - 1; i > -1; i--)
            System.out.print (arr[i]);

        System.out.println ("");
    }

    public static void inverseBuilder (StringBuilder str)
    {
        System.out.println (str.reverse ());
    }

    public static int converteInt (String str)
    {
        char[] arr = str.toCharArray();
        long ans = 0;

        for (char i : arr)
        {
            ans *= 10;
            ans += i - '0';

            if (ans > 2147483647)
                throw new IllegalArgumentException ("Valor excede o limite para números inteiros");
        }

        return (int) ans;
    }
}
