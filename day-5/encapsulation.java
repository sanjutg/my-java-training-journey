
public class encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel("Tesla Model S");
        c1.setYear(2022);
        c1.setPrice(79999.99);
        System.out.println("Car Model: " + c1.getModel());
        System.out.println("Car Year: " + c1.getYear());
        System.out.println("Car Price: $" + c1.getPrice());
    }
    public static class Car {
        private String model;
        private int year;
        private double price;

        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
    }

}
//read-only variables: variables that can only be read but cannot be modified. They are declared using the final keyword and can only be initialized once. (no setter method only getter method)
//write-only variables: variables that can only be modified but cannot be read. They are declared using the private access modifier and do not have a getter method. They can only be modified using a setter method. (no getter method only setter method)
//full encapsulation: when all the variables of a class are private and can only be accessed and modified using getter and setter methods. This ensures that the internal state of the object is protected from unauthorized access and modification. (have both getter and setter methods for all the variables)
