package pract7.n5;

public interface Functions {
    static int cnt_of_symbols(String s){
        return s.length();
    }

    static String new_string(String s){
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < s.length(); i += 2){
            string.append(s.charAt(i));
        }
        return string.toString();
    }

    static String reverse(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = s.length() - 1; i >=0; i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
