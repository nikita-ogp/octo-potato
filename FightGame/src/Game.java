public class Game {
    static boolean hit = false;

    public static void fight(Character attackSide, Character defSide) {
        int attackMod = attackSide.getAttack() - defSide.getDef() + 1;
        if (attackMod < 1) {attackMod = 1;}
        for (int i = 0; i < attackMod; i++) {
            if (getRoll() >= 5) {
                hit = true;
                minusHp(attackSide,defSide);
                break;
            } else {
                hit = false;
            }
        }
        if (!hit) {
            System.out.println(attackSide.getName()+ " промахнулся " + "                               Текущее здоровье персонажа " + defSide.getName() + " " + defSide.getCurrentHp() + " единиц");
        }

    }

    public static int getRoll() {
        int x = (int) (Math.random() * (6)) + 1;
        return x;
    }


    public static void minusHp(Character attackSide, Character defSide) {
        int damage = (int) (Math.random() * (attackSide.getAttack())) + 1;
        defSide.currentHp = defSide.getCurrentHp() - damage;
        System.out.println(attackSide.getName() + " наносит " + damage + " урона персонажу " + defSide.getName() + ".            Текущее здоровье персонажа " + defSide.getName() + " " + defSide.getCurrentHp() + " единиц");
        if (defSide.currentHp < 1){
            System.out.println("Персонаж " + defSide.getName() + (" погиб"));
        }
    }

}
