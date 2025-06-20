import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new LinkedList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) {
                cache.remove(city); 
                cache.add(city);   
                answer += 1;
            } else {
                if (cacheSize > 0 && cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                if (cacheSize > 0) {
                    cache.add(city);
                }
                answer += 5;
            }
        }
        
        return answer;
    }
}
