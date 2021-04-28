import java.io.FileNotFoundException;

public class Pets {
    private PetShop[] profiles;
    
    private int count = 0;
    
    public Pets(int y) {
        profiles = new PetShop[y];
    }
    
    private int indexOf(PetShop a) {
        // use for loop to look for x; if it exist return a; else return -1;
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i] == a) {
                return i;
            }
        }
        return -1;
    }
    
    private void doubleCapacity() {
        PetShop[] copy = new PetShop[profiles.length * 2];
        //note line below if things break it was probably this one
        System.arraycopy(profiles, 0, copy, 0, profiles.length);
        profiles = copy;
    }
    
    public boolean add(PetShop a) {
        // create int called index and run indexOf a
        int index = indexOf(a);
        if (index >= 0) {
            return false;
        }
        if (count < profiles.length) {
            count++;
            profiles[count - 1] = a;
            return true;
        } else {
            doubleCapacity();
            count++;
            profiles[count - 1] = a;
            return true;
        }
    }
    
    public boolean remove(PetShop a) {
        int index = indexOf(a);
        if (index >= 0) {
            profiles[index] = profiles[count - 1];
            profiles[count--] = null;
            return true;
        }
        return false;
    }
    
    public boolean contains(PetShop a) {
        int index = indexOf(a);
        if (index >= 0) {
            return true;
        } else return false;
    }
    
    public PetShop find(int prof) {
        for (int i = 0; i < count; i++) {
            if (PetShop.getProfileCreated() == prof) {
                return profiles[i];
            }
        }
        return null;
    }
    
    public int getCount() {
        return count;
        
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(profiles[i].toString());
            sb.append("\n***\n");
        }
        return sb.toString();
    }
    
    
    public void sort() {
        for (int i = 0; i < profiles.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < profiles.length; j++) {
                if (PetShop.getProfileCreated() < PetShop.getProfileCreated()) {
                    min = j;
                }
            }
            
            PetShop temp = profiles[min];
            profiles[min] = profiles[i];
            profiles[i] = temp;
        }
        
    }
    
    public void writeProfiles(String filename) throws FileNotFoundException {
        
        // if () {
        //  } else () {
        
        // }
        //return
        
    }
}
