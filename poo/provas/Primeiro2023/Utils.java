package poo.provas.Primeiro2023;

import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static boolean existe (List x, Biscoito y)
    {
        return (x.contains (y));
    }

    public static List getLista ()
    {
        List lista = new ArrayList();
        lista.add ("String1");
        lista.add (new Biscoito ("122"));
        lista.add (3);
        lista.add ("Carlos");
        lista.add (new Biscoito ("123"));

        return lista;
    }
}
