package pract8.n16;

public class Main {
    public static void max_cnt(String s, int max, int cnt){
        //System.out.println(s + " " + max + " " + cnt);
        if(s.equals("0")){
            System.out.println(cnt);
            return;
        }
        int first = Integer.parseInt(String.valueOf(s.charAt(0)));
        if(first > max){
            max = first;
            cnt = 0;
        }
        if(first == max){
            cnt += 1;
        }

        max_cnt(s.substring(1), max, cnt);
    }
    public static void main(String[] args) {
        max_cnt("2147147171412470", 0, 0);
    }
}
