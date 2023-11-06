public class Animal {
    private Color color;
    private int age;

    public Animal(Color color, int age) {
        this.color = color;
        this.age = age;
    }

    public Color getColor() {
        return color;
    }


    public int getAge() {
        return age;
    }

    public String info() {
        return "Age: " + this.age + " color: " + this.color.getCode() + this.color + "\u001B[0m";
    }
}

