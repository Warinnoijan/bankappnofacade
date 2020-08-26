/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;
import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author warin
 */
public class BankCustomerAccountFacade {
      private ArrayList<CustomerIf> cust = new ArrayList();
      
        public BankCustomerAccountFacade(){
            //Customer1
            ArrayList<AccountIf> custAcc1 = new ArrayList();
            AccountIf account = new BankAccount(123456);
            account.deposit(1000);
            custAcc1.add(account);
            account = new BankAccount(789101);
            account.deposit(800);
            custAcc1.add(account);
            CustomerIf customer1 = new BankCustomer("Ann", custAcc1);
            cust.add(customer1);
            
            //Customer2
            ArrayList<AccountIf> custAcc2 = new ArrayList();
            account = new BankAccount(566777);
            account.deposit(500);
            custAcc2.add(account);
            account = new BankAccount(741111);
            account.deposit(900);
            custAcc2.add(account);
            CustomerIf customer2 = new BankCustomer("Jane", custAcc2);
            cust.add(customer2);
    }

        public void doDeposit(double amt, CustomerIf cust, int accNo){
            cust.getAccount(accNo).deposit(amt);
    }

        public AccountIf getBankAccount(CustomerIf cust, int accNo){
            return cust.getAccount(accNo);
    }

        public CustomerIf getBankCustomer(String custName){
            for(CustomerIf cus : cust){
                if(cus.getCustomerName().equals(custName)){
                   return cus;
                }
            }
            return null;
    }
       
}