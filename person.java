 class Person{
    private String name,id,email;
    public void SetName(String name){
        if(name!=null){
            this.name=name;
        }else {
            System.out.println("Invalid name");
        }
    }
    public void setEmail(String email){
        if(email!=null){
            this.email=email;
        }else {
            System.out.println("Invalid email");
        }
    }
    public void setId(String id){
        if (id!=null){
            this.id=id;
        }
    }
    public String getName(){return name;}
    public String getEmail(){return email;}
    public String getId(){return id;}

    public  void displayDetails() {
        System.out.println("name:" + name);
        System.out.println("email:" + email);
        System.out.println("id:" + id);
    }
}
