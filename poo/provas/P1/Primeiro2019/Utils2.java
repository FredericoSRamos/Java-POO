package poo.provas.P1.Primeiro2019;

import java.util.List;
import java.util.ArrayList;

public class Utils2 {
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
