package poo.provas.P2.Segundo2018;

public class Processo implements Runnable
{
    public void run()
    {
        for (int i = 1; i < 1001; i++)
        {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
