package poo.provas.P2.Segundo2016;

public class Pessoa
{
    public String cpf;
    public String nome;
    public int idade;

    @Override
    public boolean equals (Object object)
    {
        if (!(object instanceof Pessoa))
            return false;

        if (((Pessoa) object).cpf.equals(this.cpf))
            return true;

        return false;
    }

    public void setCPF (String cpf)
    {
        this.cpf = cpf;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public void setIdade (int idade)
    {
        this.idade = idade;
    }

    public String getCPF()
    {
        return this.cpf;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getIdade()
    {
        return this.idade;
    }
}
