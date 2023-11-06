public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(Color.RED, 5, "Sit");
        System.out.println(dog.info());
        dog.test();
        FightingDog fightingDog1 = new FightingDog
                (Color.BLUE, 1, "Fight",  7);
        System.out.println(fightingDog1.info());
        fightingDog1.fight();
        FightingDog fightingDog2 = new FightingDog
                (Color.GREEN, 3, "Bite",  9);
        System.out.println(fightingDog2.info());
        fightingDog2.fight();
    }
}
