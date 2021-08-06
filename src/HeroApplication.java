import java.util.ArrayList;
import java.util.Objects;

public class HeroApplication {

    public static void main(String[] args) {

        //  Variable initialisation section
        String heroName;
        String heroCity;
        String heroPower1, heroPower2, heroPower3;
        boolean isEvil;
        double heroSalary;
        String realName;
        String universe;

        //  Variable assignment section
        heroName = "BuzzCat";
        heroCity = "ElectriCity";
        heroPower1 = "Electric shock";
        heroPower2 = "Elasticity";
        heroPower3 = "Cutness Overload";
        isEvil = false;
        heroSalary = 99.99;
        realName = "Muris";
        universe = "Our";

        //  Print out Hero information card
        System.out.println("**************************");
        System.out.println("**** HERO INFORMATION ****");
        System.out.println("**************************");
        System.out.println();
        System.out.println("Hero name: " + heroName);
        System.out.println("This hero lives in: " + heroCity);
        System.out.println();
        System.out.println("Hero superpowers: ");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);
        System.out.println();
        System.out.println("Is this super hero evil? " + isEvil);
        System.out.println();
        System.out.println("This hero earns: " + heroSalary + " EUR");
        System.out.println(realName + " hides his identity.");
        System.out.println("Hero lives in " + universe + " universe.");
        System.out.println();
        System.out.println("*********************************");
        System.out.println("**** END OF HERO INFORMATION ****");
        System.out.println("*********************************");
        System.out.println();



        // Create new heroes
        Hero hero1 = new Hero("Mike", "Bottle", "Milky", 115615, HeroType.Hero, 41);
        Hero hero2 = new Hero("Muris", "", "", 387684, HeroType.Villain, 20);
        Hero hero3 = new Hero("Lynda", "Cotton", "Wify", 4445, HeroType.Hero, 12);
        Hero hero4 = new Hero("Dug", "Brown", "ColourMan", 78945, HeroType.Hero, 55);
        Hero hero5 = new Hero("Lucy", "Jacks", "Skater", 35689, HeroType.Hero, 66);
        Hero hero6 = new Hero("Boo", "MacGhost", "GhostRider", 75454, HeroType.Villain, 35);
        Hero hero7 = new Hero("North", "Gale", "TornadoMan", 55897, HeroType.Villain, 8);

        // Create new array lists and districts
        ArrayList<Hero> heroesInTheDistrict1 = new ArrayList<>();
        ArrayList<Hero> heroesInTheDistrict2 = new ArrayList<>();
        District district1 = new District("Lakeside", "Mexico", 11, heroesInTheDistrict1);
        District district2 = new District("Crabbs Cross", "Oslo", 9, heroesInTheDistrict2);

        // Add heroes to the two districts
        district1.addNewHero(hero1);
        district1.addNewHero(hero2);
        district1.addNewHero(hero3);
        district2.addNewHero(hero4);
        district2.addNewHero(hero5);
        district2.addNewHero(hero6);
        district2.addNewHero(hero7);

        // Print out all info about both districts
        System.out.println(district1.toString());
        System.out.println(district2.toString());
        System.out.println();

        // Remove one hero from the district2
        district2.removeHero(3);
        System.out.println(district2.toString());
        System.out.println();

        // Calculate average level of both districts
        System.out.println(String.format("The average Level in %s is: " + district1.calculateAvgLevelInDistrict(), district1.getTitle()));
        System.out.println(String.format("The average Level in %s is: " + district2.calculateAvgLevelInDistrict(), district2.getTitle()));
        System.out.println();

        // Create an array list of districts and put both districts in the list
        ArrayList<District> listOfDistricts = new ArrayList<>();
        listOfDistricts.add(district1);
        listOfDistricts.add(district2);

        // Calculate how many heroes are in both districts together
        int amountOfHeroes = heroesInTheDistrict1.size() + heroesInTheDistrict2.size();
        System.out.println("The total amount of heroes in both districts is: " + amountOfHeroes);
        System.out.println();

        // Calculate the average Level of both districts
        float averageLvlOfDistricts = (district1.calculateAvgLevelInDistrict() + district2.calculateAvgLevelInDistrict()) / listOfDistricts.size();
        System.out.println("The average Level in both districts is: " + averageLvlOfDistricts);
        System.out.println();

        // Find out which district is the best based on the average Level of heroes
        if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println(String.format("%s is best based on average Level of heroes", district1.getTitle()));
        } else {
            System.out.println(String.format("%s is best based on average Level of heroes", district2.getTitle()));
        }
        System.out.println();

        // Delete the first district
        district1 = null;
        System.out.println(heroesInTheDistrict1.toString());
        System.out.println();



        // Create Metropole Array of Heroes
        Hero[] Metropole = {hero1, hero2, hero3};

        // Find out heroes Level
        System.out.println("MilkMan's hero level is: " + hero1.calculatedLevel());
        System.out.println("StrayCat's hero level is: " + hero2.calculatedLevel());
        System.out.println("HouseWife's hero level is: " + hero3.calculatedLevel());
        System.out.println();

        // Find out how many heroes have Level 1, and how many have above Level 1
        int hasLevel1 = 0;
        int hasLevelAbove1 = 0;
        for (Hero eachHero : Metropole) {
            if (eachHero.calculatedLevel() == 1) {
                hasLevel1++;
            } else if (eachHero.calculatedLevel() > 1) {
                hasLevelAbove1++;
            }
        }
        System.out.println("Heroes with Level 1: " + hasLevel1);
        System.out.println("Heroes with Level above 1: " + hasLevelAbove1);
        System.out.println();

        // Find out if any hero is named John
        if (Objects.equals(Hero.getName(), "John")) {
            System.out.println("There is at least one hero named John");
        } else {
            System.out.println("There are no heroes named John");
        }
    }
}
