import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                primes.add(p);
                while (n % p == 0) {
                    n /= p;
                }
            }
        }
        
        if (n > 1) primes.add(n);

        int[] answer = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) answer[i] = primes.get(i);
        return answer;
    }
}