package poo.provas.P2.Segundo2016;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Utils
{
    public boolean existe (List<Pessoa> x, Pessoa y)
    {
        return x.contains(y);
    }

    public Map<String, Pessoa> retornaDados (Set<String> conjuntoPessoas) throws FormatoIncorretoException
    {
        Map<String, Pessoa> mapa = new HashMap<>();

        Iterator<String> iterator = conjuntoPessoas.iterator();

        while (iterator.hasNext())
        {
            String string = iterator.next();

            String[] dados = string.split("#");

            if (dados.length != 3)
                throw new FormatoIncorretoException(string);

            Pessoa pessoa = new Pessoa();

            pessoa.setCPF (dados[0]);
            pessoa.setNome (dados[1]);
            pessoa.setIdade (Integer.parseInt(dados[2]));

            mapa.put (dados[0], pessoa);
        }

        return mapa;
    }
}
