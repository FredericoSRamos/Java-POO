package poo.provas.Segundo2016;

public class Cliente {
    private String cpf;

    public void setCpf (String cpf)
    {
        this.cpf = cpf;
    }

    public String getCpf ()
    {
        return this.cpf;
    }

    public void comprar (Loja loja, Produto produto)
    {
        loja.vender (produto);
        System.out.println ("Produto " + produto + " comprado com sucesso");
    }
}
