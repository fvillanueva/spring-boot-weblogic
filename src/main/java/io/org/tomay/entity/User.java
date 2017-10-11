package io.org.tomay.entity;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {

    @NotNull(message = "name no puede ser nulo")
    private String name;

    @NotNull(message = "lastName no puede ser nulo")
    private String lastName;

    @Email(regexp = ".+@.+\\\\..+",message = "email no tiene el formato correcto")
    private String email;

    @Min(value = 18,message = "age debe ser mayor o igual a 18")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
