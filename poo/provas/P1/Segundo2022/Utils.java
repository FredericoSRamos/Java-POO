package poo.provas.P1.Segundo2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
    public static boolean existe (ArrayList x, Planta y)
    {
        return x.contains (y);
    }

    public static Planta [] ordena (List x)
    {
        ArrayList<Planta> lista = new ArrayList<Planta> ();

        for (Object i : x)
        {
            if (i instanceof Planta)
                lista.add ((Planta) i);
        }

        Collections.sort (lista);

        return lista.toArray (new Planta[0]);
    }

    public static ArrayList retornaDados(ArrayList stringsPlantas)
    {
        ArrayList<Planta> lista = new ArrayList<Planta> ();

        for (Object i : stringsPlantas)
        {
            if (i instanceof String)
            {
                String[] strArr = ((String) i).split("#");
                Planta temp;

                if (strArr[3].equals ("B"))
                    temp = new Briofita (strArr[0]);

                else if (strArr[3].equals ("P"))
                    temp = new Pteridofita (strArr[0]);

                else
                    continue;

                temp.setNome(strArr[1]);
                temp.setTamanho(Double.parseDouble(strArr[2]));

                lista.add (temp);
            }
        }

        return lista;
    }
}
