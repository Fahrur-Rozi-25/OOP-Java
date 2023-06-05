public class PersonApp {
    public static void main(String[] args) {

        var person = new Person();
        person.Name = "Fahrur";
        person.address = "Java";
        System.out.println(person.Name);
        System.out.println(person.address);
        System.out.println(person.country);

        var person2 = new Person();
        person2.Name = "Dika";
        person2.sayHello("dika");

        Person person3;
        person3 = new Person();
        person3.Data(10,2);
        Person person1;
        person1 = new Person();
        person1.data2("Bola");


        var Address = new Constructor("Fahrur","Jaksel");
        System.out.println(Address.Name);
        System.out.println(Address.Address);

        Constructor constructor1;
        constructor1 = new Constructor("Dea");
        System.out.println(constructor1.Name);

        var This = new This("Cendy");
        System.out.println(This.Address);
         var Name = new This("Reza");
         Name.Name("CenDy");
    }

}
