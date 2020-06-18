public class HumanTest {
    public static void main(String[] args){
       Human human = new Human();
       String name = "Roman";
       int age = 26;
       String driverLicense = "yes";

       human.setName(name);
       human.setAge(age);
       human.setDriverLicense(driverLicense);

       String a = (name+" "+age+" "+driverLicense);
       System.out.println(a);

       StringBuilder sb = new StringBuilder("Hello");
       sb.append(" my").append(" friend");
       System.out.println(sb.toString()+" "+a);


    }

}
