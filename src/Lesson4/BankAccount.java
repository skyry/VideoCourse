package Lesson4;

import java.sql.SQLOutput;

public class BankAccount {
    int id = 1;
    String name;
    double balance;

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAcccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAcccount.id = 1;
        MyAcccount.name = "Igor";
        MyAcccount.balance = 1566;

        YourAccount.id = 2;
        YourAccount.name = "Pasha";
        YourAccount.balance = 350.50;


        HisAccount.id = 3;
        HisAccount.name = "Victor";
        HisAccount.balance = 45;


        System.out.println(MyAcccount.name);

    }
}
