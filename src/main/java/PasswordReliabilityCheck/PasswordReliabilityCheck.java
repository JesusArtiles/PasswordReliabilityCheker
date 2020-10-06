package PasswordReliabilityCheck;

public class PasswordReliabilityCheck {

    private String password;

    public boolean apply(String password){
        this.password = password;

        if(isLongEnought() && containsNumber() && containsUpperAndLowerCase() && containsUnderscore()) return true;
        return false;
    }

    private boolean isLongEnought(){
        if(password.length() < 6) return false;
        return true;
    }

    private boolean containsNumber(){
        for(char c: password.toCharArray()){
            if(Character.isDigit(c)) return true;
        }
        return false;
    }

    private boolean containsUpperAndLowerCase(){
        boolean upper = false;
        boolean lower  = false;
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c)) upper = true;
            if(Character.isLowerCase(c)) lower = true;
        }
        if(upper && lower)return true;
        return false;
    }

    private boolean containsUnderscore(){
        for(char c: password.toCharArray()){
            if(c == '_') return true;
        }
        return false;
    }
}
