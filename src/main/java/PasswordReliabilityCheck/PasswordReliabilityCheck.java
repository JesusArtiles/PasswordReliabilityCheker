package PasswordReliabilityCheck;

public class PasswordReliabilityCheck {

    public boolean apply(String password){

        if(isLongEnought(password) && containsNumber(password)) return true;
        return false;
    }

    public boolean isLongEnought(String password){
        if(password.length() < 6) return false;
        return true;
    }

    public boolean containsNumber(String password){
        for(char c: password.toCharArray()){
            if(Character.isDigit(c)) return true;
        }
        return false;
    }
}
