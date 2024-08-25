package poo.provas.P2.Segundo2018;

public class Aluno implements Comparable<Aluno>
{
    private String id;
    private String nome;
    private double nota;

    public Aluno (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof Aluno))
            return false;

        return ((Aluno) obj).getID().equals(this.id);
    }

    @Override
    public String toString()
    {
        return "ID: " + id + " | Nome: " + nome + " | Nota: " + nota;
    }

    public int compareTo (Aluno aluno)
    {
        return this.nome.compareTo(aluno.getID());
    }

    public String getID()
    {
        return this.id;
    }

    public String getNome()
    {
        return this.nome;
    }

    public double getNota()
    {
        return this.nota;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public void setNota (Double nota)
    {
        this.nota = nota;
    }
}
