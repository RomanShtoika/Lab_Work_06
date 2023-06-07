public class Exercise_1 {
    private String fullName;
    private int age;

    public Exercise_1() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    public Exercise_1(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public static void main(String[] args) {
        Exercise_1 person1 = new Exercise_1();
        Exercise_1 person2 = new Exercise_1("Shtoika Roman", 19);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}