package pl.edu.utp;

public class ArithmeticMeanCounter
{
    public static void main (String[] args){
        int a = 20;
        int b = 20;
        int c = 20;
    }
    public static double calculateMean (int... factors){
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return (double)sum / factors.length;
    }
}
