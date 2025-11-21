public class MyString {
    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println("UnHappy : " + lowerCase("UnHappy"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));

        // System.out.println("Testing contains:");
        // System.out.println(contains("unhappy", "happy")); // true
        // System.out.println(contains("happy", "unhappy")); // false
        // System.out.println(contains("historical", "story")); // false
        // System.out.println(contains("psychology", "psycho")); // true
        // System.out.println(contains("personality", "son")); // true
        // System.out.println(contains("personality", "dad")); // false
        // System.out.println(contains("resignation", "sign")); // true


    } 

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        int len = str.length();
        String final_string = "";
        
        for (int i = 0; i< len; i++){
            char letter = str.charAt(i);
            // if capital letter.
            if (letter >= 65 && letter <=90) {
                letter = (char) (letter + 32);
                final_string = final_string + letter;
            }
            // if anything else.
            else {
                final_string = final_string + letter;
            }
        }
        return final_string;
    }


    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        // str2 is empty str1 contains it.
        if (str2.length() == 0)   
            return true;

        // if str2 is bigger str1 can't contain it.
        if (str2.length() > str1.length()) 
            return false;
        
        // going over str1.
        for (int i = 0; i <= str1.length() - str2.length(); i++) 
        {
            boolean equal = true;
            // going over each char.
            for (int j = 0; j < str2.length(); j++) 
            { 
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    equal = false;
                    // if one is not equal we can alredy stop.
                    break; 
                }
            }

            if (equal)
                return true;  
        }

        return false;  // str1 doesn't contain str2.
}
}