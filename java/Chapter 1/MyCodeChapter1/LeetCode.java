package MyCodeChapter1;

public class LeetCode {
	public static void main() {
		String a = "11";
		String b = "a";
		System.out.println();
	}
	
	public String addBinary(String a, String b) {
        StringBuilder stb = new StringBuilder();
        
        String A;
        String B;
        
        if(a.length() > b.length()) {
            A = a;
            B = b;
        }
        else {
            A = b;
            B = a;
        }
        
        int maxLen = A.length();
        int minLen = B.length();
        
        int plus = 0;
        for(int i = 0; i < maxLen; i++) {
            int sum;
            if(i < minLen) {
                sum = plus + A.charAt(maxLen - i - 1) + B.charAt(minLen - i - 1);
            }
            else if(i == minLen) {
                sum = plus + A.charAt(maxLen - i - 1);
            }
            else {
                sum = A.charAt(maxLen - i - 1);
            }
            
            if(sum == 3) {
                stb.append(1);
                plus = 1;
            }
            else if(sum == 2) {
                stb.append(0);
                plus = 1;
            }
            else if(sum == 1){
                stb.append(1);
                plus = 0;
            }
            else{
                stb.append(0);
                plus = 0;
            }
        }
        if(plus == 1) stb.append(1);
        
        return stb.reverse().toString();
    }
}
