package poo.provas.P2.Primeiro2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class PrincipalLocadora
{
    public static void main (String[] args)
    {
        String[] strings = Utils.getFilmes();

        System.out.println ("Existe um total de " + strings.length + " filmes na locadora.");

        Set<Filme> set = Utils.processa(strings);

        List<Filme> lista = new ArrayList<>();

        for (Filme filme : set)
        {
            if (!(lista.contains(filme)))
                lista.add(filme);
        }

        for (Filme filme : lista)
            System.out.println (filme.titulo + ": " + Collections.frequency(set, filme) + ";");

        Collections.sort(lista);

        System.out.println (lista);
    }
}
