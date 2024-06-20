
//approach-2: using moore's voting algo
//1 2 1 1 1 1 1 2 2 3 4 1 2 
//if the counter element is similar to the previous count++, if different do count--.
//if count becomes 0, then start from the next element.
//return the element for which count is non-zero
class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int ele = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[ele]){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                ele = i+1;
            }
        }
        return arr[ele];
        
    }
}






/*
//approach-1: using hashmap
class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //storing all the elements in hashmap with occurences
        for(int i = 0; i < arr.length; i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }

        //finding the majority element
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (arr.length / 2)) {
                return it.getKey();
            }
        }
        return -1;        
    }
}
*/
