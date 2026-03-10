class Solution {
    public String frequencySort(String s) {
        StringBuilder res= new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());

        for(Map.Entry<Character,Integer> entry : list){
            char ch = entry.getKey();
            int num = entry.getValue();
            while(num-- > 0){
                res.append(ch);
            }
        }
        return res.toString();
    }
}