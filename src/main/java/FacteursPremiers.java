import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public List<Integer> primesgenerator(int limite) {
        List<Integer> primes = new ArrayList<>();

       

        return primes;
    }
    public List<Integer> generate(int limite){
        List<Integer> primes = primesgenerator(limite);
        List<Integer> resultat = new ArrayList<>();
        int climite = limite;
        for (int i = 0; i < limite; i++) {
            for (int elem : primes) {
                if(climite%elem==0){
                    resultat.add(elem);
                    climite = climite/elem;
                    break;
                }
            }
            
            
        }

        return resultat;
    }
   
}
