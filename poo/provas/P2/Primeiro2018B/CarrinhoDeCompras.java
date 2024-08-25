package poo.provas.P2.Primeiro2018B;

import java.util.ArrayList;
import java.util.List;

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
