import java.util.*;

public class SofwareMansionTask{
    public static List<Integer> algorithm(List<Integer> A, List<Integer> B){
        HashMap<Integer, Integer> sequenceB = new HashMap<>();
        for (Integer value : B) {
            if (sequenceB.containsKey(value)) {
                Integer valueCounter = sequenceB.get(value);
                valueCounter++;
                sequenceB.put(value, valueCounter);
            } else {
                sequenceB.put(value, 1);
            }
        }

        List<Integer> resultSequence = new ArrayList<>();
        for (Integer value : A) {
            Integer valueQuantityB = sequenceB.get(value);
            if(valueQuantityB == null || !(isPrime(valueQuantityB))) {
                resultSequence.add(value);
            }
        }
        return resultSequence;
    }

    public static boolean isPrime(int k){
        if (k == 2 || k == 3) return true;
        if (k <= 1 || k%2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}