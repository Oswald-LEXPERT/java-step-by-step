package challenges;

public class GroceryList {
  
  public static void main(String[] args) {
    // Ci-dessous sont des échantillons de valeurs que vous pouvez utiliser pour exécuter votre code.
    
    double[] groceryPrices = {10.0, 12.3, 8.45, 2.43};
    System.out.println(getTotalCost(groceryPrices));

    System.out.println(getMostExpensiveItemCost(groceryPrices));

    System.out.println(getLessExpensiveItemCost(groceryPrices));

    String[] groceryList = {"apple", "milk", "banana", "bananas", "chocolate"};

    System.out.println(getNumAllergicItems(groceryList));

    double[] groceryLists = {10.0, 89.9, 8.99, 2.34};
    System.out.println(hasSpecialItem(groceryLists));
    
    // double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
    // System.out.println(getTotalCost(unlikelyGroceryPrices));
    
    
    
  }
  public static double getTotalCost (double[] groceryPrices) {
    double totalCost = 0.0;
  
    for (double i = 0; i < groceryPrices.length; i++) {
  
        totalCost = groceryPrices[(int) i] + totalCost;
    }
    
    return totalCost;
  }


  public static double getMostExpensiveItemCost(double[] groceryPrices) {
    // On peut initialement assigner le premier item à `maxCost` sans erreur parce qu'on part du postulat qu'on a au moins un item dans le tableau 
    double maxCost = groceryPrices[0];
    for (double i = 0; i < groceryPrices.length;  i++) {

        if (maxCost < groceryPrices[(int) i]) {
          maxCost = groceryPrices[(int) i];
        }   
    }  
    return maxCost;
  }   

  public static double getLessExpensiveItemCost(double[] groceryPrices) {
    // On peut initialement assigner le premier item à `maxCost` sans erreur parce qu'on part du postulat qu'on a au moins un item dans le tableau 
    double minCost = groceryPrices[0];
    for (double i = 0; i < groceryPrices.length;  i++) {

        if (minCost > groceryPrices[(int) i]) {
          minCost = groceryPrices[(int) i];
        }   
    }  
    return minCost;
  }  


  public static int getNumAllergicItems(String[] groceryList) {
    int numAllergicItems = 0;
    
    for (int i = 0; i < groceryList.length; i++) {

       String AllergicItem = groceryList[i];

        if (AllergicItem.length() > 5) {
          numAllergicItems++;
        }
    }

    return numAllergicItems;
  }
  

  public static boolean hasSpecialItem(double[] groceryPrices) {
      String chaine;
    for(int i = 0; i < groceryPrices.length; i++) {

      chaine = groceryPrices[i] + "";
      if ( chaine.endsWith("99")) {
        return true;
      } 
    }
    return false;
  }
}
