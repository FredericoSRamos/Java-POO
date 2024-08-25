package poo.provas.P2.Primeiro2018;

import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Principal
{
    public static void main (String[] args)
    {
        Set<String> set = BancoDeDados.getPessoas();

        Map<String, Pessoa> mapa;

        Utils utils = new Utils();

        try
        {
            mapa = utils.retornaDados(set);

            List<Pessoa> lista = new ArrayList<>(mapa.values());

            Collections.sort(lista);

            System.out.println (lista);
        }
        catch (FormatoIncorretoException e)
        {
            System.out.println (e);
        }
    }
}