public class App {

    public static void main(String[] args) throws Exception {
        Champ Warwick = new Champ("Warwick", 6, 620, 99, 33, 4.4, 65, 3, 32, 2.05, 0.638, 0.638, 0.023);
        Champ Garen = new Champ("Garen", 6, 690, 98, 38, 4.2, 69, 4.5, 32, 1.55, 0.625, 0.625, 0.0365);
        Champ Tryndamere = new Champ("Tryndamere", 6, 696, 108, 33, 4.3, 66, 4, 32, 2.05, 0.67, 0.67, 0.34);
        Item Berserker = new Item("Berserk");
        Berserker.setas(0.35);
        Item Stridebreaker = new Item("Stridebreaker");
        Stridebreaker.setad(50);
        Stridebreaker.setas(0.30);
        Stridebreaker.sethealth(450);
        Item PhantomD = new Item("Phantom dancer");
        PhantomD.setas(0.60);
        PhantomD.setcrit_chance(0.25);
        Item Doranblade = new Item("Doran blade");
        Doranblade.setad(10);
        Doranblade.sethealth(100);
        Item Doranshield = new Item("Doran shield");
        Doranblade.sethealth(110);
        Garen.add_item(Doranshield);
        Warwick.add_item(Doranblade);
        Tryndamere.add_item(Doranblade);

        Fight Fight = new Fight(Garen, Warwick);
        Fight.gold(7*60);

    }

}
