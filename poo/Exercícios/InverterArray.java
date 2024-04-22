package poo.Exercícios;

public class InverterArray {
    public static void main (String[] args)
    {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++)
        {
            arr[i] = (int) (Math.random() * 100);
            System.out.print (arr[i] + " ");
        }
        System.out.println ("\n");
        for (int i = 0, j = arr.length - 1; i < j; i++, j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < 20; i++)
        {
            System.out.print (arr[i] + " ");
        }
    }
}
