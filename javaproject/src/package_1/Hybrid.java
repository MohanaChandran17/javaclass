package package_1;

//Parent Interface 1 
interface Animal { 
void eat(); 
} 
//Parent Interface 2 
interface Mammal { 
void walk(); 
} 
//Child Class (Implementing Multiple Interfaces) 
class Dog implements Animal, Mammal { 
public void eat() { 
System.out.println("Dog eats food."); 
} 
public void walk() { 
System.out.println("Dog walks on four legs."); 
} 
} 
//Another Class Inheriting from Dog 
class Puppy extends Dog { 
void weep() { 
System.out.println("Puppy weeps."); 
} 
} 
public class Hybrid { 
public static void main(String[] args) { 
Puppy myPuppy = new Puppy(); 
myPuppy.eat(); 
myPuppy.walk(); 
myPuppy.weep(); 
} 
}
