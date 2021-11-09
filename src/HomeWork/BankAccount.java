package HomeWork;

import javax.sound.midi.Soundbank;

public class BankAccount {
    int id = 1;
    String name;
    double balance;

    double popolnenieScheta (double x){
        balance += x;
        return balance;
    }

    double snyatieSoScheta (double y){
        balance -= y;
        return balance;
    }

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAcccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAcccount.id = 1;
        MyAcccount.name = "Igor";
        MyAcccount.balance = 1566;
        System.out.println("Name: " + MyAcccount.name + "Balance: " + MyAcccount.balance);
        MyAcccount.popolnenieScheta(200);
        System.out.println("Name: " + MyAcccount.name + "Balance: " + MyAcccount.balance);
        MyAcccount.snyatieSoScheta(1000);
        System.out.println("Name: " + MyAcccount.name + "Balance: " + MyAcccount.balance);

        YourAccount.id = 2;
        YourAccount.name = "Pasha";
        YourAccount.balance = 350.50;


        HisAccount.id = 3;
        HisAccount.name = "Victor";
        HisAccount.balance = 45;



    }
}
