package entity;

public class Seller implements UserInterface {
    private int ID;
    private int userID;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
	private String email;
	private String post;

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
    public String getPatronymic() {
        return patronymic;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPost() {
        return post;
    }

    public String getLogin() {
        return "";
    }
    public String getPassword() {
        return "";
    }
    public Permission getPermission() {
        return Permission.Editor;
    }
}
