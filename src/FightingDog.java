public final class FightingDog extends Dog {
    private int wins;

    public FightingDog(Color color, int age, String commands, int wins) {
        super(color, age, commands);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }


    public void fight() {
        this.test();
        System.out.println("Dog (" + this.getAge() + " y.o) is fighting now");
    }

    @Override
    public String info() {
        return super.info() + " wins: " + this.wins;
    }
}
