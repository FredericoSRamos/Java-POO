package poo.provas.P2.Primeiro2018;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Utils
{
    public boolean existe (List<Pessoa> x, Pessoa y)
    {
        return x.contains(y);
    }

    public static void ordena (List<Pessoa> x)
    {
        Collections.sort(x);
    }

    public Map<String, Pessoa> retornaDados (Set<String> conjuntoPessoas) throws FormatoIncorretoException
    {
        Map<String, Pessoa> mapa = new HashMap<>();

        Iterator<String> iterator = conjuntoPessoas.iterator();

        while (iterator.hasNext())
        {
            String string = iterator.next();

            String[] dados = string.split("#");

            if (dados.length != 4)
                throw new FormatoIncorretoException (string);

            Pessoa pessoa;

            if (dados[3].equals("PF"))
                pessoa = new PessoaFisica(dados[0]);
            else
                pessoa = new PessoaJuridica(dados[0]);

            pessoa.nome = dados[1];
            pessoa.idade = Integer.parseInt(dados[2]);

            mapa.put (dados[0], pessoa);
        }

        return mapa;
    }

    public static void frequencia (CarrinhoDeCompras carrinho_de_compras)
    {
        Iterator<Livro> iterator = carrinho_de_compras.getLista().iterator();

        List<Livro> lista = new ArrayList<>();

        while (iterator.hasNext())
        {
            Livro livro = iterator.next();

            if (!(lista.contains(livro)))
                lista.add(livro);
        }

        for (Livro livro : lista)
            System.out.println ("\"" + livro.getId() + "\"" + " - " + Collections.frequency(carrinho_de_compras.getLista(), livro));
    }
}
