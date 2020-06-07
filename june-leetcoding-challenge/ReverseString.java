
public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length/2;
        for(int i=0;i<n;i++){
            char temp = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i]=temp;
        }   
    }
}