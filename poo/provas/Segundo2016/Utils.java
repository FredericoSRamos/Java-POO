package poo.provas.Segundo2016;

public class Utils
{
    public byte[] converte (boolean[] lista)
    {
        byte[] arr = new byte[lista.length];
        
        for (int i = 0; i < lista.length; i++)
        {
            if (lista[i] = false)
                arr[i] = 0;
            else
                arr[i] = 1;
        }

        return arr;
    }
}