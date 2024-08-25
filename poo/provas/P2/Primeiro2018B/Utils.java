package poo.provas.P2.Primeiro2018B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils
{
    public static boolean existe (List<Animal> x, Animal y)
    {
        return x.contains(y);
    }

    public static void ordena (List<Animal> x)
    {
        Collections.sort(x);
    }

    public Map<String, Animal> retornaDados (Set<String> conjuntoAnimais)
    {
        Map<String, Animal> mapa = new HashMap<>();
        
        Iterator<String> iterator = conjuntoAnimais.iterator();

        while (iterator.hasNext())
        {
            String[] dados = iterator.next().split("#");

            Animal animal;

            if (dados[3].equals("L"))
                animal = new Leao (dados[0]);
            else
                animal = new Urso (dados[0]);

            animal.nome = dados[1];
            animal.idade = Integer.parseInt(dados[2]);

            mapa.put (dados[0], animal);
        }

        return mapa;
    }

    public static void frequencia (CarrinhoDeCompras carrinho_de_compras)
    {
        List<Livro> lista = new ArrayList<>();
        List<Livro> livros = carrinho_de_compras.getLista();

        for (Livro livro : livros)
        {
            if (!(lista.contains(livro)))
                lista.add (livro);
        }

        for (Livro livro : lista)
        {
            System.out.println ("\"" + livro.getID() + "\" - " + Collections.frequency (livros, livro));
        }
    }
}
