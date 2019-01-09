class Solution {
    public List<String> readBinaryWatch(int num) {
       List<String>result = new ArrayList<>();
       for (int i=0;i<=num;i++){
           int hourLeds = i;
           int minuteLeds = num!=0?num-i:0;
           List<String>hours = getHours(hourLeds);
           List<String>minutes = getMinutes(minuteLeds);
           for (String hour: hours){
               for (String minute: minutes){
                   result.add(hour+":"+minute);
               }
           } 
       }   
       return result;
    }
    
    public List<String> getHours(int leds){
       List<String>hours = new ArrayList<>();
       for (int i=0;i<=11;i++){
           int val = i;
           int count = 0;
           while(val>0){
              count+=(1&val);
              val = val>>1;              
           }
           if (count == leds){
              hours.add(i+"");
           }
       }
       return hours;
    }
 
    public List<String> getMinutes(int leds){
       List<String>minutes = new ArrayList<>();
       for (int i=0;i<=59;i++){ 
           int val = i;
           int count = 0;
           while(val>0){ 
              count+=(1 & val);
              val = val>>1;
           }
           if (count == leds){ 
              minutes.add(String.format("%02d",i));
           }
       }
       return minutes;
    }
 
}
