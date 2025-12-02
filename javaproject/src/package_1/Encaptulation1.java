package package_1;
class person{
    private int id;
    private String name;
    private int age;

    //getter
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void assignId(int newId) {
        this.id = newId;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}




public class Encaptulation1
{

    public static void main(String[] args) {

        // Implementation of Encapsulation
        // 1. variables declared as private
        // 2. getter and setter to modify / access values

        person obj = new person();

        obj.assignId(1);
        obj.setName("Hassini");
        obj.setAge(25);

        System.out.println("Id is " + obj.getId());
        System.out.println("Name is " + obj.getName());
        System.out.println("Age is " + obj.getAge());
    }
}
