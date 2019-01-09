import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        Pattern pattern = Pattern.compile("[0182569]*");
        Pattern antipattern = Pattern.compile("[018]*");
        for (int i=0;i<=N;i++){
           String num = String.valueOf(i);
           if (pattern.matcher(num).matches()&&!antipattern.matcher(num).matches())
              count++;
        }
        return count;
    }
}
