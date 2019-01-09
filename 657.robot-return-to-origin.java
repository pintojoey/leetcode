class Solution {
    public boolean judgeCircle(String moves) {
        int vert=0; 
        int horz=0;
        for (Character move:moves.toCharArray()){
           switch(move){
              case 'L':horz++;break; 
              case 'R':horz--;break; 
              case 'U':vert++;break; 
              case 'D':vert--;break; 
           }
        } 
       
        return (vert==0 && horz==0);
        
    }
}
