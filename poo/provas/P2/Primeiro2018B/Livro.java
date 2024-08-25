package poo.provas.P2.Primeiro2018B;

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

        return ((Livro) obj).id.equals(this.id);
    }

    public String getID()
    {
        return id;
    } 
}
