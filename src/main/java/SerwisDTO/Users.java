package SerwisDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {

    @JsonProperty("name")
    String name;

    @JsonProperty("age")
    int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users[" + "name=" + name + ", age='" + age + ']';

    }
}