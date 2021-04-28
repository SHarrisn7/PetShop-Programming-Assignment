public abstract class PetShop {
    protected static int profileCreated;
    public String name;
    public double age;
    public boolean gender;
    public String allergies;
    public String animal;
    
    public PetShop(double age, boolean gender, String allergies, String animal) {
        this.age = age;
        this.gender = gender;
        this.allergies = allergies;
        this.animal = allergies;
        profileCreated++;
    }
    
    public PetShop(String name) {
        this.name = name;
    }
    
    public static int getProfileCreated() {
        return profileCreated;
    }
    
    public abstract void updateProfile();
    
    public String getName() {
        return name;
    }
    
    public boolean isGender() {
        return gender;
    }
    
    public double getAge() {
        return age;
    }
    
    public String getAllergies() {
        return allergies;
    }
    
    public String getAnimal() {
        return animal;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    public void setAge(double age) {
        this.age = age;
    }
    
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    public void setAnimal(String animal) {
        this.animal =animal;
    }
    
    public String toString() {
        return name + "\n" + age + "\n" + gender + "\n" + allergies + "\n" + animal;
    }
}

