package poo.provas.P2.Primeiro2019;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Insira o código do produto que deseja verificar:");

        String id = sc.nextLine();
        Produto produto = new Produto (id);

        if (Utils.existe(Utils.getLista(), new Produto (id)))
            System.out.println (Utils.getLista().get(Utils.getLista().indexOf(produto)));

        sc.close();
    }

    public static Map<String, Produto> transformaListEmMap (List<Object> k)
    {
        Map<String, Produto> mapa = new HashMap<>();
        Iterator<Object> iterator = k.iterator();
        
        while (iterator.hasNext())
        {
            Object obj = iterator.next();

            if (!(obj instanceof Produto))
                continue;

            Produto produto = (Produto) obj;

            mapa.put(produto.getID(), produto);
        }

        return mapa;
    }

    public static Produto[] transformaMap (Map<String, Produto> m)
    {
        Produto[] produtos;

        Set<Map.Entry<String, Produto>> set = m.entrySet();

        produtos = new Produto[set.size()];

        int tracker = 0;

        for (Map.Entry<String, Produto> entry : set)
        {
            produtos[tracker] = entry.getValue();
            tracker++;
        }

        return produtos;
    }
}
