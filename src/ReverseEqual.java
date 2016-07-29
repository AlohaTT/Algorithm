
public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1.length() != s2.length())
            return false;
        else{
            StringBuilder s3 = new StringBuilder(s1+s1);
            for(int i=0;i<=s3.length()-s2.length();i++){
                if(s3.substring(i,i+s2.length()).equals(s2))
                    return true;
            }
            return false;
        }
    }
}