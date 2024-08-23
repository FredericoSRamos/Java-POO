package poo.provas.P1.Segundo2013;

import java.util.ArrayList;
import java.util.List;

public class Utils 
{
    public static boolean existe (List x, Produto y)
    {
        return x.contains (y);
    }

    public static List getLista ()
    {
        List lista = new ArrayList();
        lista.add ("String1");
        lista.add (new Produto ("122"));
        lista.add (3);
        lista.add ("Carlos");
        lista.add (new Produto ("123"));

        return lista;
    }
}
