package HomeWork.Lessons27;

public class Test1 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("meat"); //water, meat
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (NoWaterException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("This is finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class NoMeatException extends RuntimeException {
    NoMeatException(String meat) {
        super(meat);
    }
}

class NoWaterException extends Exception {
    NoWaterException(String water) {
        super(water);
    }
}

class Tiger {
    void eat(String eat) {
        if (eat != "meat") {
            throw new NoMeatException("Tiger dosen`t eat: " + eat);
        } else if (eat == "meat") {
            System.out.println("Tiger eats meat");
        }
    }

    void drink(String water) throws NoWaterException {
        if (water != "water") {
            throw new NoWaterException("Tiger dosen`t drink: " + water);
        } else if (water == "water") {
            System.out.println("Tiger drinks water");
        }
    }
}
