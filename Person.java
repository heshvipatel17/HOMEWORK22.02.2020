package homework22_02_20;

// 14.Write a class with the name Person. The class needs
// three fields (instance variables) with the names
// firstName, lastName of type String and age of type int.
public class Person {
    String firstName = "John ", lastName = "Smith";
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); //first Name is set to empty string
        person.setLastName(""); //last Name is set to empty string
        person.setAge(10);
        System.out.println("Full Name = " + person.getFirstName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);

        System.out.println("Full Name = " + person.getFirstName());
        System.out.println("teen " + person.isTeen());

        person.setLastName("Smith"); // last Name is set toSmith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        System.out.println(firstName);
    }

    public void setLastName(String lastName) {
        System.out.println(lastName);
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            System.out.println("Age = 0 ");
    }

    public boolean isTeen() {
        return age > 12 || age < 20;

    }

    public String getFullName() {
        return (firstName + lastName);

    }
}
