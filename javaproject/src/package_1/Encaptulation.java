package package_1;


class Name {
    private String name;   // 1. variable declared as private

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }
}
public class Encaptulation {



    public static void main(String[] args) {

        // Implementation of Encapsulation
        // 1. variables declared as private
        // 2. getter → method to access
        // 3. setter → method to modify

        Name obj = new Name();   // creating object

        // setting value using setter
        obj.setName("mohan");

        // accessing value using getter
        System.out.println("Name is: " + obj.getName());
    }
}
