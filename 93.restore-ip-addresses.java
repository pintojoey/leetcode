class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>result = new ArrayList<>();
        explore("",s,3,result);
        return result;        
    }
    public void explore(String root,String remain, int position, List<String>result){
        if (position==-1){
           result.add(root);
           return;
        }
       
        int n = remain.length();
        for (int i=1;i<=3&&i<=n;i++){
           int val = Integer.valueOf(remain.substring(0,i));
       
           if ((val==0&&!remain.substring(0,i).equals("0"))|| 
                 (val!=0&& remain.substring(0,i).startsWith("0"))||
                (position==0 &&i!=n)||val>255 || n-i>((position+1)*3)){
              continue;
           }
           else explore(root+(!root.isEmpty()?".":"")+remain.substring(0,i),remain.substring(i),position-1,result);
        }
    }
}
