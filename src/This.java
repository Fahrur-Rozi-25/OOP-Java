 class This {
    String Name;
    String Address;
    This(String paramName, String paramAddress){
        Name = paramName;
        Address = paramAddress;
    }
     This(String paramName){
        this(paramName , null);
    }

    void Name(String paramName) {
        this.Name = paramName;
        System.out.println("Hallo " + paramName);
        System.out.println(Name);
    }

}
