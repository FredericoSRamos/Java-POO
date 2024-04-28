

import java.util.Scanner;

public class TestaSplit {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        String[] words = sc.nextLine ().split(" ");

        String answer = "";

        for (int i = words.length - 1; i > -1; i--)
            answer += words[i] + " ";

        answer = answer.trim();

        System.out.println (answer);

        sc.close ();
    }
}
