package Programs.data;

public class Country {
    private String Name;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public static class City {
        private String Name;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }
    }
}

