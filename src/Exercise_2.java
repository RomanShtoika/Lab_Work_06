public class Exercise_2 {
    private String number;
    private String model;
    private double weight;

    public Exercise_2() {
        // Default constructor
    }

    public Exercise_2(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Exercise_2(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String callerName) {
        System.out.println("Incoming call from " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Incoming call from " + callerName + " (" + callerNumber + ")");
    }

    public void sendMessage(String... numbers) {
        System.out.println("Sending message to the following numbers:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Exercise_2 phone1 = new Exercise_2("+0974633241", "Realme 9 Pro", 0.22);
        Exercise_2 phone2 = new Exercise_2("+0672563245", "Xiaomi Redmi 10 Plus", 0.2);
        Exercise_2 phone3 = new Exercise_2("+0960993344", "Samsung S20" ,0.21);

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.number);
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight);

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.number);
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight);

        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.number);
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight);

        phone1.receiveCall("Roman Lopachenko", "+0672563245");
        phone2.receiveCall("Ihor Bodnev", "+0960993344");

        phone3.sendMessage("+0974633241", "+0672563245", "+0960993344");
    }
}
