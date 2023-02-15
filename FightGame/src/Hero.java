public class Hero extends Character {
    public int healUsed = 0;
    public static int limitHeal = 3;

    Hero(String name, int attack, int def, int health) {
        super(name, attack, def, health);
    }


    public static void heal(Hero hero) {
        if (hero.healUsed == limitHeal) {
            System.out.println("Вы не можете исцелиться больше 3 раз");
        } else {
            int potion = hero.health / 2;
            if (hero.getHealth() < hero.currentHp + potion) {
                potion = hero.getHealth() - hero.currentHp;
            }
            if (hero.currentHp < hero.health) {
                hero.currentHp += potion;
                hero.healUsed++;
                System.out.println("Вы исцелили здоровье на " + potion + " до " + hero.getCurrentHp() + " единиц. Осталось возможностей лечения: " + (3- hero.healUsed));
            } else {
                System.out.println("Вы не можете исцелиться - у вас максимум здоровья");
            }
        }
    }


}
