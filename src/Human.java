public class Human {
    private String name;
    private int age;
    private String driverLicense;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDriverLicense() {
        return driverLicense;
    }
    public Human (){

    }

    public Human(String name, int age, String driverLicense){
        this.name = name;
        this.age = age;
        this.driverLicense = driverLicense;
    }


}
