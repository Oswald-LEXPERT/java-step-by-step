package challenges_2;

import java.util.ArrayList;

public class BeeHive {
    private ArrayList<Bee> beeList;

    public BeeHive(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    public void printBees() {
        for (Bee bee : beeList) {
            System.out.println(bee.getName());
        }
    }

    public void leaveHome(String bee) {
        // String beeName = bee.substring(3);
        // int beeNumber = Integer.valueOf(beeName);
        // beeList.get(beeNumber).leaveHome();

        for (Bee b : beeList) {
            if (b.getName().equals(bee)) {
                b.leaveHome();
                return;
            }
        }
    }

    public void addBees(ArrayList<String> beeNames) {
        for(String name : beeNames) {
            this.beeList.add(new Bee(name));
        }
    }

    public void moveOutBees() {
      //this.beeList.clear(); // srpprime tous les éléments
      while (this.beeList.size() > 0) {
        this.beeList.remove(0); // supprime un élément
      }
    }

    public static void main(String[] args) {
        BeeHive myHive = new BeeHive(5);
        System.out.println(myHive);
        myHive.leaveHome("bee43");

        ArrayList<String> newBees = new ArrayList<String>();
        newBees.add("bob");
        newBees.add("macey");
        newBees.add("anna");

        myHive.addBees(newBees);

        // Afficher les éléments dans la liste d'abeille pour s'assurer que les
        // nouvelles abeille ont été ajoutées
        for (Bee b : myHive.beeList) {
            System.out.println(b.getName());
        }
    }
}
