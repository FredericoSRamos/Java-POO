package poo.provas.P2.Segundo2018;

public class Principal
{
    public static void main (String[] args)
    {
        Processo p1 = new Processo();
        Processo p2 = new Processo();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }
}
