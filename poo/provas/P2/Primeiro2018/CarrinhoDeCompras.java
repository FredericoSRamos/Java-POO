package poo.provas.P2.Primeiro2018;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras
{
    private List<Livro> lista = new ArrayList<>();

    public List<Livro> getLista()
    {
        return lista;
    }

    public void inserir (Livro livro)
    {
        lista.add (livro);
    }
}
