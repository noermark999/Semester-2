package Opgave3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {
        PersonAdministrator pa = PersonAdministrator.getInstance();
        Person person = new Person("Jakob", 21);
        Person person1 = new Person("Peter", 34);
        pa.addPerson(person);
        pa.addPerson(person1);
        System.out.println(pa.getPersoner());
        PersonAdministrator personAdministrator = PersonAdministrator.getInstance();
        personAdministrator.removePerson(person1);
        System.out.println(pa.getPersoner());
    }
}
