public class Character {
    public String name;
    public int attack;
    public int def;
    public int health;
    public int currentHp;

    public Character(String name, int attack, int def, int health) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
        } else {
            this.name = name;
        }
        if (attack >= 1 && attack <= 20) {
            this.attack = attack;
        } else {
            System.out.println("Значение атаки должно быть от 1 до 20");
        }

        if (def >= 1 && def <= 20) {
            this.def = def;
        } else {
            System.out.println("Значение защиты должно быть от 1 до 20");
        }

        if (health < 0) {
            System.out.println("Значение здоровья не может быть меньше 0");
        } else {
            this.health = health;
        }

        currentHp = health;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
        } else {
            this.name = name;
        }
    }

    public void setAttack(int attack) {
        if (attack >= 1 && attack <= 20) {
            this.attack = attack;
        } else {
            System.out.println("Значение атаки должно быть от 1 до 20");
        }
    }

    public void setDef(int def) {
        if (def >= 1 && def <= 20) {
            this.def = def;
        } else {
            System.out.println("Значение защиты должно быть от 1 до 20");
        }
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Значение здоровья не может быть меньше 0");
        } else {
            this.health = health;
        }
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public int getHealth() {
        return health;
    }

    public int getCurrentHp() {
        return currentHp;
    }

}
