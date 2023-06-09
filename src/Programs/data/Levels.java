package Programs.data;

public enum Levels {
    STANDARD("Standard Editon"),
    PREMIUM("Premium Edition"),
    VIP("Vip Edition");
    private String description;
    Levels(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}

