package sofengg;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Driver {
    public static void main(String[] args) {
        /*Connection conn = SQLiteConnect.getConnection();
        SQLiteTransactionManager sql = new SQLiteTransactionManager();
        
        List<Transaction> tr = sql.viewTransactions();    
        
        for(int i=0; i< tr.size(); i++){
            System.out.print(tr.get(i).getDate() + " ");
            System.out.print(tr.get(i).getName() + " ");
            System.out.print(tr.get(i).getHaircut() + " ");
            System.out.println(tr.get(i).getAmount());
      
        }
        */
        
        Connection conn = SQLiteConnect.getConnection();
        SQLiteTransactionManager sql = new SQLiteTransactionManager();
        BigDecimal ms = sql.viewMonthlySales();
        //List<MonthlySales> ms = sql.viewMonthlySales();    
        
        System.out.println(ms);
        
        System.out.println(" ");
        System.out.println(" ");
        
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        BigDecimal expense;
        String expenseName;
        System.out.println("Enter the expense");
        expense = myObj.nextBigDecimal();
        
        System.out.println("Enter the name of the expense");
        expenseName = myObj2.nextLine();
   
        ExpenseList List = new ExpenseList();
        List.addtoexpense(expense, expenseName);
        List.viewList();
        List.removefromexpense(expense, expenseName);
        Long ln = new Long("745812345678"); 
        BigDecimal b = BigDecimal.valueOf(ln); 
        List.addtoexpense(b, "Expenses");
        List.viewList();
    }
    
}
