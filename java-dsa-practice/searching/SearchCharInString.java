public class SearchCharInString {

    static Boolean charExists(String str, char ch){
        // for(int i  = 0; i<str.length(); i++)
        //     if(str.charAt(i) == ch)
        //         return true;
        
        for(char ele : str)
            if(ele == ch)
                return true;
        
        
        return false;
    }


    public static void main(String[] args){
        String str = "Aryan";
        char ch  = 'a';

        System.out.println(ch + " exists in " + str + " ? " + charExists(str, ch));

    }    
}
