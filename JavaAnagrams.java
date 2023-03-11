/* Function Description
Complete the isAnagram function in the editor.
isAnagram has the following parameters:
string a: the first string
string b: the second string
Returns
boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format:
The first line contains a string. 
The second line contains a string.

Constraints:
Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.

Sample Input:
anagram
margana 

Sample Output:
Anagrams

Explanation:
Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
*/

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean ret = false;
        StringBuilder c= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<c.length();j++){
                    if(a.charAt(i)==c.charAt(j)){
                            c.deleteCharAt(j);
                        if(i==a.length()-1 && c.length()==0){
                            ret=true;
                            break;
                        }
                        break;
                    }}
            }
        }return ret; 
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
