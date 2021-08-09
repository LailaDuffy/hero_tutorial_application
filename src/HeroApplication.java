import java.util.*;

public class HeroApplication {

    //  Variable initialisation section
    String[] heroArray;

    // Function to add new hero in array
    public static String[] addNewHero(String heroArray[], String newHeroName) {
        // create a new ArrayList
        List<String> arrayList = new ArrayList<String>(Arrays.asList(heroArray));

        // add the new hero element
        arrayList.add(newHeroName);

        // convert the Arraylist to array
        heroArray = arrayList.toArray(heroArray);

        // return the array
        return heroArray;
    }

    // Function to remove a hero from an array
    public static String[] removeHero(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrayList = new ArrayList<String>(Arrays.asList(heroArray));

        // find and remove a String from an array
        arrayList.remove(heroIndexToDelete);

        // convert the Arraylist to array
        heroArray = arrayList.toArray(heroArray);
        heroArray = Arrays.copyOf(heroArray, heroArray.length - 1);
        // return the array
        return heroArray;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        // Create new heroes
        Hero hero1 = new Hero("Mike", "Bottle", "Milky", 115615, 41);
        Hero hero2 = new Hero("Chris", "Baker", "MuffinMan", 1124, 40);
        Hero hero3 = new Hero("Lynda", "Cotton", "Wify", 4445, 12);
        Hero hero4 = new Hero("Dug", "Brown", "ColourMan", 78945, 55);
        Hero hero5 = new Hero("Lucy", "Jacks", "Skater", 35689, 66);
        Hero hero6 = new Hero("Ziggy", "Stardust", "GuitarMan", 22141, 19);
        Hero hero7 = new Hero("Nancy", "Stardust", "LadyStar", 33474, 3);

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

        // Remove one hero from the district2
        district2.removeHero(3);
        System.out.println(district2.toString());
        System.out.println();

        // Create an array list of districts and put both districts in the list
        ArrayList<District> listOfDistricts = new ArrayList<>();
        listOfDistricts.add(district1);
        listOfDistricts.add(district2);

        // Delete the first district
        /*district1 = null;
        System.out.println(heroesInTheDistrict1.toString());
        System.out.println();*/

        // Create new villains
        Villain villain1 = new Villain("Muris", "", "Mr Catvil", 7867, 20);
        Villain villain2 = new Villain("Boo", "MacGhost", "GhostRider", 65566, 35);
        Villain villain3 = new Villain("North", "Gale", "TornadoMan", 77898, 8);

        // Create an arraylist for all villains and put all the villains in it
        ArrayList<Villain> villainArrayList = new ArrayList<>();
        villainArrayList.add(villain1);
        villainArrayList.add(villain2);
        villainArrayList.add(villain3);

        // Create Metropole Array of Heroes
        Hero[] Metropole = {hero1, hero2, hero3};

        // OLD VARIABLES
        String[] heroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};
        double[] heroSalaries = {1000.00d, 1111d};
        String[] heroCities = {};

        // MENU
        int menuEntry;
        Scanner scanner = new Scanner(System.in);

        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. Show specific superhero information
        // 5. Delete the superhero from the list
        // 6. Print info about heroes
        // 7. Print into about districts
        // 8. Print info about villains
        // 0. Exit
        do {
            // EXIT == 0
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero");
            System.out.println("5 - Print information about heroes");
            System.out.println("6 - Print information about districts");
            System.out.println("7 - Print information about villains");
            System.out.println("0 - Exit");
            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:

                    System.out.println("======== SUPERHERO LIST +++++++++");
                    for (String heroName : heroList) {
                        System.out.println(heroName);
                    }
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Enter hero's name: ");
                    String newHeroName = scanner.next();
                    heroList = addNewHero(heroList, newHeroName);
                    break;
                case 3:

                    // Show different information, based on selected superhero!
                    System.out.println("Which superhero info to print?");
                    int superheroIndex = scanner.nextInt();
                    // String superHeroName = scanner.next();

                    System.out.println("Hero name: " + heroList[superheroIndex]);

                    // Variable initialization
                    String heroName;
                    String heroCity;
                    String heroPower1, heroPower2, heroPower3;
                    boolean isEvil;
                    double heroSalary;
                    String realName;
                    String universe;

                    // Variable assignment
                    heroName = "TurboSnail";
                    heroCity = "Garden";
                    heroPower1 = "Speed";
                    heroPower2 = "Nitro boost";
                    heroPower3 = "";
                    isEvil = false;
                    heroSalary = 12.55;
                    realName = "Jim";
                    universe = "Bugs";

                    // Print out Hero information card
                    System.out.println("****************************");
                    System.out.println("***** HERO INFORMATION *****");
                    System.out.println("****************************");

                    System.out.println("Hero name: " + heroName);
                    System.out.println("This hero lives in: " + heroCity);

                    System.out.println("----------------------------");
                    System.out.println("Hero Superpowers: ");
                    System.out.println("---" + heroPower1);
                    System.out.println("---" + heroPower2);
                    System.out.println("---" + heroPower3);

                    System.out.println("Is this super hero is evil? " + isEvil);

                    System.out.println("This hero earns: " + heroSalary + " EUR");
                    System.out.println(realName + " hides his identity.");
                    System.out.println("Hero lives in " + universe + " Universe");
                    System.out.println();
                    System.out.println("****************************");
                    System.out.println("***** HERO INFORMATION *****");
                    System.out.println("****************************");

                    // If a hero is a villain or a hero
                    if (isEvil) {
                        System.out.println("Hero is a villain. he is stealing cookies!!!");
                    } else {
                        System.out.println("Hero protects the city!");
                    }

                    heroCity = "Metropolis";

                    switch (heroCity) {
                        case "New York":
                            heroSalary = 2000;
                            break;
                        case "Riga":
                            heroSalary = 1200.91;
                            break;
                        case "Metropolis":
                            heroSalary = 1000000;
                            break;
                        default:
                            heroSalary = 100;
                    }

                    System.out.println("Hero's new salary: " + heroSalary);
                    // How many cookies can superhero purchase for his /her salary
                    // 1 cookie costs = 1.29 euro
                    System.out.println("**********************************");
                    System.out.println("********** Financials ***************");
                    int numOfCookies = (int) Math.floor(heroSalary / 1.29);
                    System.out.println("Hero can purchase: " + numOfCookies + " cookies");
                    double averageDailySalary = Math.round((heroSalary / 30 * 100)) / 100;
                    System.out.println("Hero average daily salary is: " + averageDailySalary + " euro");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Please enter hero index to be removed");
                    int heroIndexToDelete = scanner.nextInt();

                    heroList = removeHero(heroList, heroIndexToDelete);
                    break;
                case 5:
                    System.out.println("Here is information about all heroes");
                    System.out.println();

                    // Information about heroes
                    for (Hero eachHero : heroesInTheDistrict1) {
                        System.out.println(eachHero.toString());
                    }
                    for (Hero eachHero : heroesInTheDistrict2) {
                        System.out.println(eachHero.toString());
                    }
                    System.out.println();

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

                    /*// Find out if any hero is named John
                    if (Hero.getName().equals("John")) {
                        System.out.println("There is at least one hero named John");
                    } else {
                        System.out.println("There are no heroes named John");
                    }*/
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Here is information about the districts");
                    System.out.println();

                    // Print out all info about both districts
                    System.out.println(district1.toString());
                    System.out.println(district2.toString());
                    System.out.println();

                    // Calculate average level of both districts
                    System.out.println(String.format("The average Level in %s is: " + district1.calculateAvgLevelInDistrict(), district1.getTitle()));
                    System.out.println(String.format("The average Level in %s is: " + district2.calculateAvgLevelInDistrict(), district2.getTitle()));
                    System.out.println();

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
                    break;
                case 7:
                    System.out.println("Here is information about villains");
                    System.out.println();

                    // Print out all information about villains
                    System.out.println(villain1.toString());
                    System.out.println(villain2.toString());
                    System.out.println(villain3.toString());
                    System.out.println();

                    // Find out the total number of crimes of Villains
                    int totalCrimeTime = 0;
                    for (Villain eachVillain : villainArrayList) {
                        totalCrimeTime += eachVillain.getCrimeTime();
                    }
                    System.out.println("The total crime time of all the villains is: " + totalCrimeTime);

                    // Find which villain is involved in the most crimes
                    Villain largestCrimeVillain = new Villain();
                    for (Villain eachVillain : villainArrayList) {
                        for (Villain everyVillain : villainArrayList) {
                            if (eachVillain.getCrimeTime() < everyVillain.getCrimeTime()) {
                                largestCrimeVillain.setNickname(everyVillain.getNickname());
                            }
                        }
                    }
                    System.out.println("The villain with the largest crime time is: " + largestCrimeVillain.getNickname());
                    System.out.println();
                    break;
                default:
                    System.out.println("Menu item does not exist");
            }

        } while (menuEntry != 0);

    }

}

