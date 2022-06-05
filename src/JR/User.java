package JR;

public class User {
    String name;
    short age;
    int height;

    User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    User(String name, int height, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

}

