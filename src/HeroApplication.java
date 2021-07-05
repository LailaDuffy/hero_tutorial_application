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

//  Variable assignement section
        heroName = "AliexpressMan";
        heroCity = "Dobele";
        heroPower1 = "Super discounts";
        heroPower2 = "Fast delivery";
        heroPower3 = "";
        isEvil = false;
        heroSalary = 99.99;
        realName = "Artjoms";
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
        System.out.println("**************************");
        System.out.println("**** END OF HERO INFORMATION ****");
        System.out.println("**************************");
    }
}
