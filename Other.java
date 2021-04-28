public class Other extends PetShop {
    private final double findOther;
    
    
    public Other(String name, String r, double findOther) {
        super(name);
        this.findOther = findOther;
    }
    
    
    public double getFindCat() {
        return findOther;
    }
    
    public void addOther() {
        double addOther = (1.0 + findOther);
    }
    
    @Override
    public void updateProfile() {
    
    }
    
    public String toString() {
        return "Other\n" + super.toString() + "\n Avaliable Animals:\t%"
                + findOther;
    }
    }
