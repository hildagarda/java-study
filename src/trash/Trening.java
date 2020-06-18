package trash;

public class Trening {
    public static void main (String[] args){
      Person person1 = new Person();
      person1.name = "Роман";
      person1.age = 25;
      person1.speak();
      Person person2 = new Person ();
      person2.name = "Лена";
      person2.age = 25;
      person2.sayHello();



    }
}
class Person {
    String name;
    int age;

    public void setName(String satName){
        name = satName;
    }
    public String setName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет! "+ name);
    }
}
