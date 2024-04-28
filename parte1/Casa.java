public class Casa {
    private String cor;
    private int totalDePortas;
    public Porta [] portas;

    Casa ()
    {
        portas = new Porta[10];
    }

    public void pinta (String s)
    {
        this.cor = s;
    }

    public String getCor ()
    {
        return this.cor;
    }

    public int quantasPortasEstaoAbertas ()
    {
        int total = 0;

        for (Porta i : portas)
        {
            if (i != null)
                if (i.estaAberta())
                    total++;
        }

        return total;
    }

    public void adicionaPorta (Porta p)
    {
        for (int i = 0; i < portas.length; i++)
        {
            if (portas[i] == null)
            {
                this.totalDePortas++;
                portas[i] = p;
                break;
            }
        }
    }

    public int totalDePortas ()
    {
        return this.totalDePortas;
    }
}
