package poo.provas.P1.Primeiro2019;

public class Media {
    public static double calcula (String numeros)
    {
        String[] temp = numeros.split ("#");

        double total = 0;
        int track = 0;

        for (String i : temp)
        {
            if (i.contains (".") || i.contains (","))
                continue;

            total += Integer.parseInt (i);
            track++;
        }

        if (track == 0)
            return 0;
        else
            return total / track;
    }
}
