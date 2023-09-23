package pract4.n1;

public enum Season {
    Winter(-20),
    Spring(6),
    Summer(24),
    Autumn(10);

    private int mean;
    private Season(int temp){
        this.mean = temp;
    }

    public int getMean() {
        return mean;
    }

    public String getDescription(){
        if (this == Summer){
            return "Warm season";
        }
        return "Cold season";
    }

    public static void ilove(Season en){
        switch (en){
            case Autumn -> {
                System.out.println("I love Autumn");
                break;
            }
            case Winter -> {
                System.out.println("I love Winter");
                break;
            }
            case Spring -> {
                System.out.println("I love Spring");
                break;
            }
            case Summer -> {
                System.out.println("I love Summer");
                break;
            }
        }
    }
}
