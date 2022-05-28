package Lesson23;

public class Test6 {


}

class Animal {
    static String showName() {
        return "some Animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {
    static String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }


    public static void main(String[] args) {
        Mouse a = new Mouse();
        Animal a1 = new Animal();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();

    }
}
