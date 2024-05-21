class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // Trim leading and trailing spaces
        char[] arr = s.toCharArray(); // Convert string to character array
        int n = arr.length;
        int start = 0;
        
        // Step 1: Reverse individual words
        for (int end = 0; end < n; end++) {
            if (arr[end] == ' ') {
                reverseString(arr, start, end - 1); // Reverse the current word
                start = end + 1; // Move start to the beginning of the next word
            } else if (end == n - 1) {
                reverseString(arr, start, end); // Handle the last word in the string
            }
        }
        
        // Step 2: Reverse the entire string (to correct word order)
        reverseString(arr, 0, n - 1);
        
        // Step 3: Remove extra spaces and convert character array back to string
        return cleanSpaces(arr, n);
    }
    
    private void reverseString(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    
    private String cleanSpaces(char[] arr, int n) {
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && arr[j] == ' ') j++; // Skip spaces
            while (j < n && arr[j] != ' ') arr[i++] = arr[j++]; // Keep non-space characters
            while (j < n && arr[j] == ' ') j++; // Skip spaces
            if (j < n) arr[i++] = ' '; // Add only one space between words
        }
        return new String(arr, 0, i); // Convert char array to string with valid length
    }

    
}
