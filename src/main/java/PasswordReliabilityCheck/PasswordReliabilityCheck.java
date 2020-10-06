package PasswordReliabilityCheck;

public class PasswordReliabilityCheck {

    public boolean apply(String password){

        if(isLongEnought(password) && containsNumber(password) && containsUpperAndLowerCase(password) && containsUnderscore(password)) return true;
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

    public boolean containsUpperAndLowerCase(String password){
        boolean upper = false;
        boolean lower  = false;
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c)) upper = true;
            if(Character.isLowerCase(c)) lower = true;
        }
        if(upper && lower)return true;
        return false;
    }

    public boolean containsUnderscore(String password){
        for(char c: password.toCharArray()){
            if(c == '_') return true;
        }
        return false;
    }
}
