public class Cats extends PetShop {
    
    private final double findCat;
    
    
    public Cats(String name, String r, double findCat) {
        super(name);
        this.findCat = findCat;
    }
    
    
    public double getFindCat() {
        return findCat;
    }
    
    public void addCat() {
        double addCat = (1.0 + findCat);
    }
    
    @Override
    public void updateProfile() {
    
    }
    
    public String toString() {
        return "Cats\n" + super.toString() + "\nAvaliable Cats:\t%"
                + findCat;
    }
}
