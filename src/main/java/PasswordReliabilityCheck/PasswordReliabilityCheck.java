package PasswordReliabilityCheck;

public class PasswordReliabilityCheck {

    public boolean apply(String password){
        if(password.length() < 6) return false;
        return true;
    }
}
