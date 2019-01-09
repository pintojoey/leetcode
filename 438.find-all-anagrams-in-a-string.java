class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        int i=0,j=0;

        HashMap<Character,Integer>target=new HashMap<>();
        HashMap<Character,Integer>proc = new HashMap<>();

        for(Character c:p.toCharArray()){
             target.put(c, target.getOrDefault(c,0)+1);
        }
        while(j<s.length()) {

            char ch = s.charAt(j);
            proc.put(ch, proc.getOrDefault(ch,0)+1);

            if (target.size()==proc.size()){
                boolean match = true;
                for(Character c:target.keySet()){
                    if(target.get(c)!=proc.get(c)){match=false;break;}
                }
                if(match)result.add(i);
            }

            if (j-i>=p.length()-1){
               ch = Character.valueOf(s.charAt(i));
               proc.put(ch, proc.get(ch)-1);
               if(proc.get(ch)==0)proc.remove(ch);
               i++;
               j++;
            }
            else j++;
        
        }
        System.out.println(proc);
        return result;
    }
}
