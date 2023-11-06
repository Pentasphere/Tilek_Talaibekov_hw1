public class Dog extends Animal {
    private String commands;

    public Dog(Color color, int age, String commands) {
        super(color, age);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public final void test() {
        System.out.println("Dog (" + this.getAge() + " y.o) is beautiful");
    }

    public String info() {
        return super.info() + " commands: " + this.commands;
    }
}

