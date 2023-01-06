package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User (String name, String email){
        this.name = name;
        this.email = email;
    }

    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número telefonico debe ser de 8 digitos máximos");
        }
        else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;
        }
    }
    //termina getters and setter


    @Override
    public String toString() {
        return "model.User: " +name+", email: "+ email+",\nAddress: "+address+". phone: "+phoneNumber;
    }

    public abstract void showDataUser();

}
