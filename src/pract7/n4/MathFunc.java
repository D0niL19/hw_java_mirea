package pract7.n4;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double root, int cnt) {
        double ans = 1;
        if (cnt == 0){
            return 1;
        }
        for(int i = 0; i < cnt; i++){
            ans *= root;
        }
        return ans;
    }

    @Override
    public double abs(double n) {
        if (n <= 0){
            return n * -1;
        }
        return n;
    }
}
