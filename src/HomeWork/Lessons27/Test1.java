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
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        if (!eat.equals("meat")) {
            throw new NoMeatException("Tiger dosen`t eat: " + eat);
        }
        System.out.println("Tiger eats meat");
    }

    void drink(String water) throws NoWaterException {
        if (!water.equals("water")) {
            throw new NoWaterException("Tiger dosen`t drink: " + water);
        }
        System.out.println("Tiger drinks water");
    }
}
