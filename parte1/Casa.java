public class Casa {
    String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    void pinta (String s)
    {
        this.cor = s;
    }

    int quantasPortasEstaoAbertas ()
    {
        int total = 0;
        if (porta1.estaAberta())
            total++;
        if (porta2.estaAberta())
            total++;
        if (porta3.estaAberta())
            total++;

        return total;
    }
}
