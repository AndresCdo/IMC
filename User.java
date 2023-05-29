public class User {
    private String name;
    private String lastName;
    private double height;
    private double weight;

    public User(String name, String lastName, double height, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    public String classifyBMI() {
        double bmi = this.calculateBMI();
        if (bmi <= 18.5) return "Underweight";
        else if (18.5 < bmi && bmi <= 24.9) return "Normal weight";
        else if (25.0 < bmi && bmi <= 29.9) return "Pre-obesity";
        else if (30.0 < bmi && bmi <= 34.9) return "Obesity class I";
        else if (35.0 < bmi && bmi <= 39.9) return "Obesity class II";
        else if (40.0 <= bmi) return "Obesity class III";
        else return "Error in BMI classification";
    }
}
