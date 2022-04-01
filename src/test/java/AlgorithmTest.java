import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class AlgorithmTest {
    @Test
    public void testAlgorithm(){
        List<Integer> sequenceA = new ArrayList<>();
        sequenceA.add(2);
        sequenceA.add(3);
        sequenceA.add(9);
        sequenceA.add(2);
        sequenceA.add(5);
        sequenceA.add(1);
        sequenceA.add(3);
        sequenceA.add(7);
        sequenceA.add(10);

        List<Integer> sequenceB = new ArrayList<>();
        sequenceB.add(2);
        sequenceB.add(1);
        sequenceB.add(3);
        sequenceB.add(4);
        sequenceB.add(3);
        sequenceB.add(10);
        sequenceB.add(6);
        sequenceB.add(6);
        sequenceB.add(1);
        sequenceB.add(7);
        sequenceB.add(10);
        sequenceB.add(10);
        sequenceB.add(10);

        List<Integer> resultSequence = new ArrayList<>();
        resultSequence.add(2);
        resultSequence.add(9);
        resultSequence.add(2);
        resultSequence.add(5);
        resultSequence.add(7);
        resultSequence.add(10);


        assertEquals(resultSequence, SofwareMansionTask.algorithm(sequenceA, sequenceB));
    }

}
