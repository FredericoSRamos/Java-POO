public class Porta {
    private boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;

    void abre ()
    {
        aberta = !aberta;
    }

    void fecha ()
    {
        aberta = !aberta;
    }

    void pinta (String s)
    {   
        this.cor = s;
    }

    boolean estaAberta ()
    {
        return this.aberta;
    }
}
