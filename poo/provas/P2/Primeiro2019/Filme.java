package poo.provas.P2.Primeiro2019;

public class Filme implements Comparable<Filme>
{
    public int id;
    public String titulo;
    public int ano;

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof Filme))
            return false;

        return (((Filme) obj).titulo.equals(titulo));
    }

    public int compareTo (Filme filme)
    {
        return titulo.compareTo(filme.titulo);
    }
}
