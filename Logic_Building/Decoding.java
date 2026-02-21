// Problem: Decoding CodewordsRam and Shyam are exchange messages. 
// To keep them secret from Jadav, 
// they use a convention:'a' to 'i' codes are 1 to 9.
// 'j' to 'z' codes are 10# to 26#.
// Given a numeric string $S$, return the decoded lowercase message.
// Input Format:A single string $S$ containing digits and '#'.
// Constraints:$1 \le S.length \le 10^9$Output Format:The decoded string in lowercase.
// Example:Input:26#21#13#13#114#97820#
// Output:zummanight
// Edge Case:If the input is empty, the output is empty. 
// If the code is single digits without #, it decodes to 'a'-'i'.


public class Decoding {
    
    public String decode(String s){
        if(s == null || s.length() ==0)
            return "";

        StringBuilder result = new StringBuilder();

        int i = 0;
        while(i <s.length()){
            // check for two-digit number followed by "#"

            if(i +2 < s.length() && s.charAt(i+2)=='#'){
                int num = (s.charAt(i) - '0') *10 
                + (s.charAt(i + 1) - '0');

                result.append((char)('a' + num - 1));
                i +=3;
            }else{
                int num = s.charAt(i) - '0';
                result.append((char)('a' + num -1));
                i++;
            }
        }
        return result.toString();
    }
}
