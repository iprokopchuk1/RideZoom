package zum;

public class User {

    private String email;
    private String firstName;
    private String lasName;
    private String phoneNumber;
    private String zipCode;
    private String state;
    private String referralCode;


    public User(String email, String firstName, String lasName, String phoneNumber, String zipCode,
                String state, String referralCode) {
        this.email = email;
        this.firstName = firstName;
        this.lasName = lasName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.referralCode = referralCode;


    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getReferralCode() {
        return referralCode;
    }














}
