package poo.provas.P2.Primeiro2018;

public abstract class Pessoa implements Comparable<Pessoa>
{
    public String cpf;
    public String nome;
    public int idade;

    public Pessoa (String cpf)
    {
        this.cpf = cpf;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof Pessoa))
            return false;

        Pessoa pessoa = (Pessoa) obj;

        if (pessoa.cpf.equals(this.cpf) && pessoa.idade == this.idade)
            return true;

        return false;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade;
    }

    public int compareTo (Pessoa pessoa)
    {
        return this.nome.compareTo(pessoa.nome);
    }
}