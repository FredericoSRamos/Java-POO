package poo.provas.P2.Primeiro2022;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils
{
    public static boolean existe (Collection<CorpoCeleste> x, CorpoCeleste y)
    {
        return x.contains(y);
    }

    public static void ordena (List<CorpoCeleste> x)
    {
        Collections.sort(x);
    }

    public static Map<String, CorpoCeleste> retornaDados (Set<String> conjuntoCorpos) throws FormatoIncorretoException
    {
        Iterator<String> iterator = conjuntoCorpos.iterator();
        
        Map<String, CorpoCeleste> mapa = new HashMap<>();
        
        while (iterator.hasNext())
        {
            String string = iterator.next();

            String[] strings = string.split("#");

            if (strings.length != 4)
                throw new FormatoIncorretoException (string);

            CorpoCeleste corpo_celeste;

            if (strings[3].equals("P"))
                corpo_celeste = new Planeta (strings[0]);
            else
                corpo_celeste = new Estrela (strings[0]);

            corpo_celeste.setNome(strings[1]);
            corpo_celeste.setDistancia(Double.parseDouble (strings[2]));

            mapa.put (strings[0], corpo_celeste);
        }

        return mapa;
    }
}
