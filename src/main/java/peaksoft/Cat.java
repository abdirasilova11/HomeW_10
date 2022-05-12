package peaksoft;

public class Cat implements Animal {
    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("Cat is cute");
    }

    @Override
    public void animalMinus() {
        System.out.println("Cat is sleep");
    }
    public String toString(){
        return "name:" + name +
                " breed:" + breed +
                " age:" + age;
    }
}
