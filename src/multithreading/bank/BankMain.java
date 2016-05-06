package multithreading.bank;

import multithreading.bank.Banckier;
import multithreading.bank.Bank;

/**
 * Created by User on 29.04.2016.
 */
public class BankMain {
    Bank bank = new Bank();
    Banckier banckier = new Banckier(bank);
    Thread bankier1Thred = new Thread(banckier);

}
