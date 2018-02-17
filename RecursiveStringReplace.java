package recursion;
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to)
    {
        String result = null;

        // IMPLEMENT THIS RECURSIVE METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
    if (s.length() < 1) {
        return s;
    }
    else {
        char one = (from == s.charAt(0)) ? to : s.charAt(0);
        return one + replace(s.substring(1),from,to);
}
//<<<<<<<<<<<<<<<<<<<<<<<<<        

    //return result;
    }


}
