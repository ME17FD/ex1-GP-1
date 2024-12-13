import java.util.List;

public class Main {

    public static void main(String[] args) {
        FacteursPremiers facteursPremiers = new FacteursPremiers();
        List<Integer> primes = facteursPremiers.generate(220);

        System.out.println("Prime numbers up to 20: " + primes);    }
}


