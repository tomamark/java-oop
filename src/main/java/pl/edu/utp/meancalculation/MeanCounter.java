package pl.edu.utp.meancalculation;

import pl.edu.utp.ArithmeticMeanCounter;

public class MeanCounter {
    public static void main(String[] args) {
        int a = 20;
        int b = 60;
        int c = 20;
        MeanAlgorithm meanAlgorithm = new ArithmeticMeanAlgorithm();
        meanAlgorithm.add(a);
        meanAlgorithm.add(b);
        meanAlgorithm.add(c);
        double mean = meanAlgorithm.calculateMean();
        System.out.println (mean);
        MeanAlgorithm geomeanAlgorithm = new GeometricMeanAlgorithm();
        geomeanAlgorithm.add(a);
    }
}