package TugasWeek9;

public class Main {
    public static void main(String[] args) {
        Intelligence hero1 = new Intelligence();
        Strength hero2 = new Strength();
        Agility hero3 = new Agility();


        hero1.start();
        hero1.nama = "Mirana";
        System.out.println(hero1.nama);
        hero1.attackpower = 50.99;
        System.out.println("Attack Power :" + hero1.attackpower);
        hero1.health = "100 hp";
        System.out.println("Health :" +  hero1.health);
        hero1.manaMaximum = 12;
        System.out.println("Mana Maximum :" + hero1.manaMaximum);
        hero1.manaRegeneration = 0.05;
        System.out.println("Mana Regeneration :" + hero1.manaRegeneration);
        hero1.attributes();
        System.out.println();

        hero2.start();
        hero2.nama = "Dragon Knight";
        System.out.println(hero2.nama);
        hero2.attackpower = 78.64;
        System.out.println("Attack Power : " + hero2.attackpower);
        hero2.health = "120 hp";
        System.out.println("Health : " + hero2.health);
        hero2.healthRegeneration = 0.1;
        System.out.println("Health Regeneration : " + hero2.healthRegeneration);
        hero2.attributes();
        System.out.println();

        hero3.start();
        hero3.nama = "invoker";
        System.out.println(hero3.nama);
        hero3.attackpower = 65.43;
        System.out.println("Attack Power : " + hero3.attackpower);
        hero3.health = "110 hp";
        System.out.println("Health : " + hero3.health);
        hero3.attackspeed = 1;
        System.out.println("Attack Speed : " + hero3.attackspeed);
        hero3.armor = 0.167;
        System.out.println("Armor : " + hero3.armor);
        hero3.attributes();
        System.out.println();

        
    }
}
