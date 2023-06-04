class Person {
String Name;
String address;
final String country = "indonesia";
  void sayHello(String paramName) {
      System.out.println("Hallo "+paramName+" , My Name Is , "+Name);
  }
  void Data ( int number1  , int number2) {
      if (number1 <= number2){
          System.out.println("Nilai nya Kurang boss");
      }else {
          System.out.println("Nilai nya Pas");

      }
    };
    void data2 (String Hobby){
        switch (Hobby){
            case "Bola" -> System.out.println("Hobby Anda Bola");
            default -> System.out.println("Anda Gak Punya Hobby");
        }
    }

}
