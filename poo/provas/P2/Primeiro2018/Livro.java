package poo.provas.P2.Primeiro2018;

public class Livro
{
    private String id;

    public Livro (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof Livro))
            return false;

        if (((Livro) obj).getId().equals(this.getId()))
            return true;

        return false;
    }

    public String getId()
    {
        return this.id;
    }
}
