public class FibonacciRecursivo
{
    public static int calculaFibonacci (int i, int[] arr)
    {
        return (i < 3) ? 1 : arr[i - 2] + arr[i - 3];
    }
}