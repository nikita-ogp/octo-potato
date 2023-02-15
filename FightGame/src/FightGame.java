import java.util.Scanner;

public class FightGame {
    public static void main(String[] args) {
        Character m1 = new Character("Lulu", 15, 8, 80);
        Character m2 = new Character("Nunu", 16, 10, 100);
        Character m3 = new Character("Zuzu", 14, 9, 90);
        Hero h1 = new Hero("Hero", 15, 8, 100);

        System.out.println("Выберите противника для боя:");
        System.out.println("1." + m1.getName());
        System.out.println("2." + m2.getName());
        System.out.println("3." + m3.getName());

        Scanner s1 = new Scanner(System.in);
        int choiceStep = s1.nextInt();
        switch (choiceStep) {
            case 1:
                boolean death = false;
                while (!death) {

                    System.out.println("Выберите действие:");
                    System.out.println("1. Атаковать противника");
                    System.out.println("2. Восполнить здоровье");
                    Scanner s2 = new Scanner(System.in);
                    int choiceStep2 = s2.nextInt();
                    switch (choiceStep2) {
                        case 1:
                            Game.fight(h1, m1);
                            Game.fight(m1, h1);
                            death = h1.getCurrentHp() <= 0 || m1.getCurrentHp() <= 0;
                            break;
                        case 2:
                            Hero.heal(h1);
                    }

                }
                break;
            case 2:
                boolean death2 = false;
                while (!death2) {

                    System.out.println("Выберите действие:");
                    System.out.println("1. Атаковать противника");
                    System.out.println("2. Восполнить здоровье");
                    Scanner s3 = new Scanner(System.in);
                    int choiceStep2 = s3.nextInt();
                    switch (choiceStep2) {
                        case 1:
                            Game.fight(h1, m2);
                            Game.fight(m2, h1);
                            death2 = h1.getCurrentHp() <= 0 || m2.getCurrentHp() <= 0;
                            break;
                        case 2:
                            Hero.heal(h1);
                    }

                }
                break;
            case 3:
                boolean death3 = false;
                while (!death3) {

                    System.out.println("Выберите действие:");
                    System.out.println("1. Атаковать противника");
                    System.out.println("2. Восполнить здоровье");
                    Scanner s4 = new Scanner(System.in);
                    int choiceStep2 = s4.nextInt();
                    switch (choiceStep2) {
                        case 1:
                            Game.fight(h1, m3);
                            Game.fight(m3, h1);
                            death3 = h1.getCurrentHp() <= 0 || m3.getCurrentHp() <= 0;
                            break;
                        case 2:
                            Hero.heal(h1);
                    }

                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choiceStep);
        }
    }


}

