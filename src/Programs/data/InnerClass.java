package Programs.data;

public class InnerClass {

    private String Name;

    public String getName() {
        System.out.println(Name);
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public class home  {

        public String getHome(){
            return InnerClass.this.getName();
        }

    private String Name;

       public String getName() {
           return Name;
       }

       public void setName(String name) {
           Name = name;
       }
   }
}
