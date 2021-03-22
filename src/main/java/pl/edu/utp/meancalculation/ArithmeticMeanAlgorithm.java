package pl.edu.utp.meancalculation;

public class ArithmeticMeanAlgorithm implements MeanAlgorithm {
    private int currentSum;
    private int noOfFactors;
    /*
    int currentSum;
    int noOfFactors;
    */

    //constructor
    public ArithmeticMeanAlgorithm(){
        currentSum = 0;
        noOfFactors = 0;
    }
    public void add(int a) {
        currentSum += a;
        noOfFactors++;

    }
    public double calculateMean() {
        return ((double)currentSum/noOfFactors);
    }


}
