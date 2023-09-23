package pract4.n2;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if (this == XXS){
            return "Kid size";
        }
        return "Adult size";
    }
}
