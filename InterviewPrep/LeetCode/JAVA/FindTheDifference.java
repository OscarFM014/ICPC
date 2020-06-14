public class FindTheDifference{

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
        for (char i : s.toCharArray()) {
            dic.put(i, dic.getOrDefault(i, 0) + 1);
        }

        for (char i : t.toCharArray()) {
            if (dic.containsKey(i) && dic.get(i) == 0 || !dic.containsKey(i)) {
                return i;
            } else {
                dic.put(i, dic.get(i) - 1);
            }
        }
        return '!';
        
    }
}