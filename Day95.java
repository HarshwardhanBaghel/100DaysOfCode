class Solution {
    public int maxProduct(int[] arr) {
        
        int result = arr[0];
	    
        for(int i=0;i<arr.length;i++) {
	     
            int p = arr[i];
	    
            for(int j=i+1;j<arr.length;j++) {
	      
                result = Math.max(result,p);
	     
                p *= arr[j];
	      
            }
	       
            result = Math.max(result,p);
	   
        }
	  
       return result;  
    }
}