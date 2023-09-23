package pract4.n1;

public class n1 {
    public static void main(String[] args){
        Season season = Season.Winter;
        System.out.println(season.toString());
        Season.ilove(season);

        for (Season ses: Season.values()){
            System.out.println(ses + " " + ses.getMean() + " " + ses.getDescription());
        }
    }
}
