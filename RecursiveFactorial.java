package recursion;

public class RecursiveFactorial
{

    /**
     * The basic recursive factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long basic(long n)
    {
        // IMPLEMENT THIS METHOD 
        // AND RETURN SOMETHING APPROPRIATE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
        //long result;
        if(n < 2){
            return 1;}
        else {
            return  (n * (n-1) * basic(n-2));
        
       // return 0;
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
        } 
    }
    
    
    
    /**
     * The tail recursive version of factorial.
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long tailRecursive(long n)
    {
        // IMPLEMENT THIS METHOD USING THE RECURSIVE HELPER FUNCTION
        // AND RETURN SOMETHING APPROPRIATE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
        
        return helper(n,1);
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    /**
     * The tail recursive helper function for factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @param  partial   The partial result that is being built up.
     * @return     n factorial.
     */

    private long helper(long n, long partial) {
        
        if (n<2){
            return partial *1;
        }
        else {
            return helper(n-1,n*partial);
        }

        // IMPLEMENT THIS TAIL RECURSIVE METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  
      
        //return result;
    }

}
