import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public List<Integer> primesgenerator(int limite) {
        List<Integer> primes = List.of(2);

       

        return primes;
    }
    public List<Integer> generate(int limite){
        List<Integer> primes = primesgenerator(limite);
        List<Integer> resultat = new ArrayList<>();
        for (int i = 0; i < limite; i++) {
            for (int elem : primes) {
                if(limite%elem==0){
                    resultat.add(elem);
                    limite = limite/elem;
                    break;
                }
            }
            
            
        }

        return resultat;
    }
   
}
