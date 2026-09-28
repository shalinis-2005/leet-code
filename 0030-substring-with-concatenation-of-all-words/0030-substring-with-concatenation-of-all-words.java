class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || words.length == 0)
            return result;
        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        if (s.length() < totalLen)
            return result;
        HashMap<String, Integer> required = new HashMap<>();
        for (String word : words)
        {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }
        for (int offset = 0; offset < wordLen; offset++) 
        {
            int left = offset;
            int count = 0;
            HashMap<String, Integer> seen = new HashMap<>();
            for (int right = offset; right + wordLen <= s.length(); right += wordLen)
            {
                String word = s.substring(right, right + wordLen);
                if (!required.containsKey(word)) 
                {
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;
                while (seen.get(word) > required.get(word)) 
                {
                    String remove = s.substring(left, left + wordLen);
                    seen.put(remove, seen.get(remove) - 1);
                    left += wordLen;
                    count--;
                }
                if (count == wordCount) 
                {
                    result.add(left);
                    String remove = s.substring(left, left + wordLen);
                    seen.put(remove, seen.get(remove) - 1);
                    left += wordLen;
                    count--;
                }
            }
        }
        return result;
    }
}