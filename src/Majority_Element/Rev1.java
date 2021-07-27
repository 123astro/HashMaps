package Majority_Element;

public class Rev1 {
}
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int number : nums){
            if(!freq.containsKey(number)){
                freq.put(number,  1);
            } else {
                freq.put(number, (freq.get(number) + 1));
            }
        }
        int maxValue = 0;
        for( int testValue : freq.values())
            if(testValue > maxValue){
                maxValue = testValue;
            }
        for(int key : freq.keySet()){
            if(freq.get(key) == maxValue){
                return key;
            }
        }
        return 1;
    }

}
