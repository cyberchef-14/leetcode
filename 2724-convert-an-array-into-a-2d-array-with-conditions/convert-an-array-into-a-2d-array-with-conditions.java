

class Solution {
    public List<List<Integer>> findMatrix(int[] v) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : v) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int f = entry.getKey();
                int s = entry.getValue();
                temp.add(f);
                s--;
                if (s == 0) {
                    toErase.add(f);
                }
                map.put(f, s);
            }
            ans.add(temp);
            for (int i : toErase) {
                map.remove(i);
            }
        }
        return ans;
    }
}

