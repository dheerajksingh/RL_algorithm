package test;

public class StringCombination {
	
	private int getTotalPermutationSize(String str){
		int len = str.length();
		int totalsize=1 ;
		for(int i =len;i>0;i--){
			totalsize*=i;
		}
		return totalsize;
	}
	
	public static void main(String args[]){
		String str = "abc";
		
		long startTime = System.currentTimeMillis();
		
		StringCombination stringCombination = new StringCombination();
			
		StringBuffer strBuffer[] = stringCombination.findPermutation(str);
		
		for(int l=0;l<strBuffer.length;l++){
			System.out.println(strBuffer[l]);
		}
		System.out.println(strBuffer.length);
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
	}
	
		private StringBuffer[] findPermutation(String str){
			
			if(str.length()==1){
				return new StringBuffer[]{new StringBuffer(str)};
				
			}
			
			
			StringBuffer[] buffArr = new StringBuffer[getTotalPermutationSize(str)];
			int burrArrCount=-1;
			for(int i = 0;i<str.length();i++){
				 char c = str.charAt(i);
				 StringBuffer[] buffR = findPermutation(new StringBuffer(str).deleteCharAt(i).toString());
				 for(int l=0;l<buffR.length;l++){
					 buffArr[++burrArrCount] = new StringBuffer();
					 buffArr[burrArrCount].append(c).append(buffR[l]);
				 }
			}
			return buffArr;
		}

}
