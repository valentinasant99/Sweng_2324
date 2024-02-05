package com.example.sweng.shared.utente;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable, Comparable<User> {

    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Email: " + this.email + "\n" +
                "Password: " + this.password;
    }

    @Override
    public int compareTo(User otherUser) {
        int emailComparison = this.email.compareTo(otherUser.getEmail());
        if (emailComparison != 0) {
            return emailComparison;
        }
        return this.password.compareTo(otherUser.getPassword());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User otherUser = (User) obj;
        return Objects.equals(this.email, otherUser.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
