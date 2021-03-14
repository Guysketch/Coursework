public class PetTest {

    public static void main(String[] args) {
        SortedADT sorted = new Pet();
        String PetName;
        Integer option;
        do {
            System.out.println("Welcome to Derick & Son Pet Supplier");
            System.out.println("0: quit");
            System.out.println("1: add a new pet type");
            System.out.println("2: remove a specific pet type");
            System.out.println("3: find a specific pet type");
            System.out.println("4: display details of all pets");
            System.out.println("5: display a specific pet type");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    PetName = Input.getString("Pet Type: ");
                    try {
                        sorted.insert(PetName);
                        System.out.println("inserted");
                    } catch (SortedADT.NotUniqueException e) {
                        System.out.println("insert invalid - PetName not unique");
                    }
                    break;
                case 2:
                    PetName = Input.getString("PetName: ");
                    try {
                        PetName = (String) sorted.remove(PetName);
                        System.out.println(PetName + " removed");
                    } catch (SortedADT.NotFoundException e) {
                        System.out.println("remove invalid - PetName not found");
                    }
                    break;
                case 3:
                    PetName = Input.getString("PetName: ");
                    try {
                        PetName = (String) sorted.find(PetName);
                        System.out.println(PetName + " found");
                    } catch (SortedADT.NotFoundException e) {
                        System.out.println("PetName not found");
                    }
                    break;
                case 4:
                    // downcast as method not part of the interface
                    System.out.println(((Pet) sorted).getTraversals());
                    break;
                case 5:
                    System.out.println(sorted);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }
}
