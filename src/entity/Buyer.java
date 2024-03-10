package entity;

public class Buyer implements UserInterface {
    private int ID;
    private int userID;
    private String surname;
    private String name;
    private String phoneNumber;
	private String email;
	private String city;
	private String street;
	private String building;
	private int flat;

    public int getID() {
        return ID;
    }
    public int getUserID() {
        return userID;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getBuilding() {
        return building;
    }
    public int getFlat() {
        return flat;
    }

    public String getLogin() {
        return "";
    }
    public String getPassword() {
        return "";
    }
    public Permission getPermission() {
        return Permission.Reader;
    }
}
