class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer>visits=new HashMap<>();
        for (String domain: cpdomains){
             String parts[] = domain.split(" ");
             int count = Integer.parseInt(parts[0]);
             String dom = parts[1];
             visits.put(dom,visits.getOrDefault(dom,0)+count);
             int i=dom.indexOf(".");
             while(i>0){
                 dom=dom.substring(i+1);
                 visits.put(dom, visits.getOrDefault(dom,0)+count);
                 i=dom.indexOf(".");
             } 
        }
	List<String>results =new ArrayList<>();
        for (String key:visits.keySet()){
            results.add(visits.get(key) +" "+ key);
        }
        return results;
    }
}
