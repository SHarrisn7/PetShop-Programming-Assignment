import java.util.Scanner;

public class ProfileFinder {
    private static final Pets pets = new Pets(4);
    
    public static void main(String[] args) {
        char command = 0;
        int profile = 0;
        String filename = "";
        Scanner input = new Scanner(System.in);
        printMenu();
        do {
            System.out.println("\nPlease enter a command or type ?");
            command = input.nextLine().toLowerCase().charAt(0);
    
            switch (command) {
                case 'a':
                    int profileType = -1;
                    while (profileType < 1 || profileType > 2) {
                        System.out.print("\nEnter 1 for Cats or 2 for Dogs Or 3 for Other: ");
                        profileType = Integer.parseInt(input.nextLine());
                    }
                    System.out.print("Enter Animals name: ");//change this before submitting
                    String name = input.nextLine();
    
                    PetShop a;
                    if (profileType == 1) {
                        System.out.print("Enter Cat Profile Name: ");
                        String r = String.indexOf(input.nextLine());
                        a = new Cats(name, r); //IMPORTANTO FINISH THIS
                    }
                    if
                    (profileType == 2) {
                        System.out.print("Enter Dog Profile Name: ");
                        String c = String.indexOf(input.nextLine());
                        a = new Dogs(name, c);
                    } else
                        System.out.print("Enter Other Profile Name: ");
                    String d = String.indexOf(input.nextLine());
                    a = new Other(name, d);
                    if (pets.add(a)) System.out.print("\n Animal Profile was successfully added.\n");
                    else System.out.print("\nAnimal Profile was NOT added. Duplicate Profile.\n");
                    break;
                case 'b':
                    System.out.print("\nEnter Profile name: ");
                    profile = Integer.parseInt(input.nextLine());
                    if (pets.remove(pets.find(profile)))
                        System.out.print("\nAnimal Profile successfully removed CONGRATS ON THE ADOPTION!!!.\n");
                    else System.out.print("Animal Profile was NOT found. Cannot remove.\n");
                    break;
                case 'c':
                    System.out.println(pets.toString());
                    break;
                case 'd':
                    pets.sort();
                    System.out.println("Animal Profiles sorted.");
                    break;
                case 'e':
                    System.out.print("\nEnter Animal Profile name: ");
                    profile = Integer.parseInt(input.nextLine());
                    PetShop b = pets.find(profile);
                    if (b == null) {
                        System.out.print("That animal was not found. Cannot update.\n");
                        break;
                    }
            
                    int action = -1;
                    while (action < 1 || action > 2) {
                        System.out.print("\nEnter 1 to adopt or 2 for return your furry friend :( -");
                        action = Integer.parseInt(input.nextLine());
                    }
            
                    Cats sa = new Cats("", a);
                    Dogs ca = new Dogs("", b);
            
                    if (b.getClass() == sa.getClass()) {
                        sa = (Cats) b;
                        sa.addCat();
                        System.out.println("Cats Profiles Were Updated:\n" + sa.toString());
                    } else if (b.getClass() == ca.getClass()) {
                        ca = (Dogs) b;
                        System.out.println("Dogs Profiles Were Updated:\n" + ca.toString());
                    }
                    break;
        
                case '?':
                    printMenu();
                    break;
                case 'q':
                    System.out.println("GOOD BYE! THANK YOU FOR SHOPPING AT MY PET SHOP");
                    break;
                default:
                    System.out.println("Invalid");
        
            }
            // input.close();
        }
    }
    
    public static void printMenu() {
        System.out.print("\nAvailable Animals\n" + "-----------------------------------\n"
                + "a: add an animal to the shop\n" + "b: remove an animal profile from the shop\n"
                + "c: display the available animals in the shop\n"
                + "d: sort the animals in the shop\n" + "e: update an animal profile in the shop\n"
                + "?: display the menu again\n" + "q: quit shopping at Pets Smart\n\n");
        
    }
    
}



