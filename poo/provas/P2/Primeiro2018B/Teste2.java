package poo.provas.P2.Primeiro2018B;

public class Teste2
{
    public static void main(String[] args)
    {
        System.out.println("inicio");
        metodo1();
        System.out.println("fim");
    }

    public static void metodo1()
    {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    public static void metodo2()
    {
        System.out.println("inicio do metodo2");
        int [] array = new int [2];
        for (int i = 0; i <= 4; i++)
        {
            try 
            {   
                array[i] = i;
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println (e);
            }
        }
        System.out.println("fim do metodo2");
    }
}
