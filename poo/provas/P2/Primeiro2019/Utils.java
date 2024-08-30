package poo.provas.P2.Primeiro2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utils
{
    public static boolean existe (List<Object> x, Produto y)
    {
        return x.contains(y);
    }

    public static List<Object> getLista()
    {
        List<Object> lista = new ArrayList<>();

        lista.add ("Pedro");
        lista.add(12);
        lista.add(new Produto ("123"));
        lista.add(5.879);
        lista.add('c');

        return lista;
    }

    public static String[] getFilmes()
    {
        String[] strings = new String[3];

        strings[0] = "123#Morro dos ventos uivantes#1939";
        strings[1] = "443#Morro dos ventos uivantes#1939";
        strings[2] = "443#A ilha#2005";

        return strings;
    }

    public static Set<Filme> processa (String[] filmes)
    {
        Set<Filme> set = new HashSet<>();

        for (String string : filmes)
        {
            String dados[] = string.split("#");

            Filme filme = new Filme();

            filme.id = Integer.parseInt (dados[0]);
            filme.titulo = dados[1];
            filme.ano = Integer.parseInt (dados[2]);

            set.add (filme);
        }

        return set;
    }
}
