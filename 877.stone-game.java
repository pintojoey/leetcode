class Solution {
    public boolean stoneGame(int[] piles) {
       List<Integer>list = new ArrayList<>();
   
       for (Integer pile: piles){
	   list.add(pile);
       }
       Collections.sort(list);
       int alex=0;
       int lee=0;
       for (int i=0;i<piles.length;i++){
          if (i%2==0)lee+=list.get(i);
          else alex+=list.get(i);
       }
       return alex>lee;
    }
}
