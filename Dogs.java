public class Dogs extends PetShop {
    private final double findDog;
    
    
    public Dogs(String name, String r, double findDog) {
        super(name);
        this.findDog = findDog;
    }
    
    
    public double getFindDog() {
        return findDog;
    }
    
    public void addDog() {
        double addDog = (1.0 + findDog);
    }
    
    @Override
    public void updateProfile() {
    
    }
    
    public String toString() {
        return "Dogs\n" + super.toString() + "\nAvaliable Dogs:\t%"
                + findDog;
    }
    }
