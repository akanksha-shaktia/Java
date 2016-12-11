public class ZigZagConversion {

	public static void main(String[] args) {
		String s = "paypalishiring";
		int numRows = 5;
		StringBuffer op = new StringBuffer();
        int x = 1;
        int colnum = 0;
        if(numRows <= 1){
            System.out.print(s);
        }else{
            x = numRows*2 -2;
        colnum = (s.length()/x)*2;
        if(s.length()%x > numRows){
            colnum += 2; 
        }else if(s.length()%x <= numRows){
        	 colnum += 1; 
        }
        }
        int sp = 0;        
        String zg[][] = new String[numRows][colnum];
        for(int i=0; i<colnum; ){
            for(int j=0; j<numRows ; j++){
                    if(sp<s.length()){
                    zg[j][i] = s.charAt(sp)+"";
                    sp++;
                    }else{
                        break;
                    }
            }
            i+=2;
            sp = sp+numRows-2;
        }
        sp = numRows;
        for(int i=1; i<colnum; ){
            for(int j=numRows-2; j>0 ; j--){
                if(sp<s.length()){
                    zg[j][i] = s.charAt(sp)+"";
                    sp++;
                }else{
                    break;
                }
            }
            i=i+2;
            sp = sp+numRows;
        }
        
        for(int i=0; i<numRows; i++){
            for(int j=0; j<colnum; j++){
                if(zg[i][j]!=null){
                    op.append(zg[i][j]);
                }else{
                    continue;
                }
            }
        }
        System.out.println(op.toString());
	}

}
