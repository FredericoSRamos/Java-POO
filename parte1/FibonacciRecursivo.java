public class FibonacciRecursivo
{
    int calculaFibonacci (int i)
    {
        return (i < 3) ? 1 : calculaFibonacci(i - 1) + calculaFibonacci(i - 2);
    }
}