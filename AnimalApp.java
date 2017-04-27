public class AnimalApp {
  public static void main(String[] args) {

    Animals ani1 = new Animals();
    ani1.name = "Pandora";
    ani1.breed = "beagle";
    ani1.age = 9;
    ani1.phone = "6262508882";

    Animals ani2 = new Animals();
    ani2.name = "Ben";
    ani2.breed = "golden retriever";
    ani2.age = 12;
    ani2.phone = "6263357674";

    Animals ani3 = new Animals();
    ani3.name = "Berlin";
    ani3.breed = "dirty cat";
    ani3.age = 3;
    ani3.phone = "6264558489";


    Animals[] roster = {ani1,ani2,ani3};
    System.out.println("roster");

    for (Animals animal : roster) {
      System.out.println("--------------");
      System.out.println(animal.name);
      System.out.println(animal.breed);
      System.out.println(animal.age);
      System.out.println(animal.phone);
    }
  }
}
