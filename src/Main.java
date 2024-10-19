public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(56);
        boss.setTypeOfProtection("Magic");
        System.out.println("Health:" + " " + boss.getHealth());
        System.out.println("Damage:" + " " + boss.getDamage());
        System.out.println("Type Of Protection:" + " " + boss.getTypeOfProtection());

        Hero[] heroes = createHeroes();
        for (Hero hero: heroes){
            System.out.println("Health:" + " " + hero.getHealth());
            System.out.println("Damage:"+ " " + hero.getDamage());
            System.out.println("Ability:" + " " + hero.getAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero thunderMagic = new Hero(200, 100, "Lighting");
        Hero fireMagic = new Hero(180, 80, "Fire Baal");
        Hero iceMagic = new Hero(210, 90);

        Hero[] heroes = {thunderMagic, fireMagic, iceMagic};
        return heroes;
    }
}