/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankCustomerAccountFacade obj = new BankCustomerAccountFacade();
        AccountIf acc;
        
        CustomerIf cust1 = obj.getBankCustomer("Ann");
        System.out.println("------------ Customer 1 -------------");
        System.out.println("Customer and account information");
        System.out.println("Name = " + cust1.getCustomerName());
        System.out.println("Has " + cust1.getNumAccounts() + " accounts");
        
        //Cutomer1 Account1
        acc = obj.getBankAccount(cust1, 123456);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        //Cutomer1 Account2
        acc = obj.getBankAccount(cust1, 789101);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        
        //Deposit
        obj.doDeposit(1000,cust1,789101);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
         
        //Total
        ArrayList<AccountIf> accounts1 = obj.getBankCustomer("Ann").getllAccounts();
        for(AccountIf account : accounts1) {
            System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
        }
        
        System.out.println("------------ Customer 2 -------------");
        
        CustomerIf cust2 = obj.getBankCustomer("Jane");
        System.out.println("Customer and account information");
        System.out.println("Name = " + cust2.getCustomerName());
        System.out.println("Has " + cust2.getNumAccounts() + " accounts");
        
        //Cutomer2 Account1
        acc = obj.getBankAccount(cust2, 566777);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        //Cutomer2 Account2
        acc = obj.getBankAccount(cust2, 741111);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        
        //Deposit
        obj.doDeposit(600, cust2, 741111);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
         
        //Total
        ArrayList<AccountIf> accounts2 = obj.getBankCustomer("Jane").getllAccounts();
        for(AccountIf account : accounts2) {
            System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
        }
    }

}
