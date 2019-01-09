class RecentCounter {
    Queue<Integer>pings;   
    public RecentCounter() {
        pings = new LinkedList<>();
    }
    
    public int ping(int t) {
        pings.add(t);
        while(t-pings.peek()>3000){
           pings.poll();
        }
        return pings.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
