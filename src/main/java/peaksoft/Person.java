package peaksoft;

public class Person {
    private String name;
    private Animal animal;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void CallMethods(){
        animal.animalMinus();
        animal.animalPlus();
    }
    public void CallMethodsOfKitten(){
        animal.animalMinus();
        animal.animalPlus();
    }

    public  String toString(){
        return "name:" + name +
                " age:" + age +
                 " " + animal;
    }
}
