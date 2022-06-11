package Lessons27;

public class Test15 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("Temp bega bil slishom visokim - " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi probejali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(20, 15);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("V lubom sluchae vi pluchili gramotu");
        }
    }

}


class PodvernutNoguException extends Exception {
    PodvernutNoguException(String massage) {
        super(massage);
    }

    PodvernutNoguException() {
    }

}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String massage) {
        super(massage);
    }

    SveloMishcuException() {
    }
}