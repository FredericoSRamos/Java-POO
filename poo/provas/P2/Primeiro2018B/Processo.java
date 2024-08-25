package poo.provas.P2.Primeiro2018B;

public class Processo implements Runnable
{
    public void run ()
    {
        for (int i = 1; i < 1001; i++)
        {
            if (i % 2 == 0)
                System.out.println (i);
        }
    }
}
