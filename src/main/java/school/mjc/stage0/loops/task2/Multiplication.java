package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0, res;

        while (i<=multiplyByAndToInclusive){
            res = i*multiplyByAndToInclusive;
            System.out.println(res);
            i++;
        }
    }
}
