import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void testGenerate() {
        FacteursPremiers facteursPremiers = new FacteursPremiers();
        
        List<Integer> result = facteursPremiers.generate(1);
        assertEquals(List.of(), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(2);
        assertEquals(List.of(2), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(3);
        assertEquals(List.of(3), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(4);
        assertEquals(List.of(2, 2), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(6);
        assertEquals(List.of(2, 3), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(8);
        assertEquals(List.of(2, 2,2), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(9);
        assertEquals(List.of(3, 3), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(12);
        assertEquals(List.of(2, 2,3), result, "les facteurs premiers sont pas correcte");
        result = facteursPremiers.generate(220);
        assertEquals(List.of(2,2,5,11), result, "les facteurs premiers sont pas correcte");
    }
}
