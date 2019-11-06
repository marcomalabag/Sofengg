/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofengg;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MarcoMalabag
 */
public class ExpenseList {
    
    private ArrayList<Expense> expenses;
    
    public void addtoexpense(BigDecimal Expense, String name)
    {
        Expense expense = new Expense(Expense, name);
        this.expenses = new ArrayList<Expense>();
        this.expenses.add(expense);
    }
    
    public int getsize()
    {
        return this.expenses.size();
    }
    
    public void viewList()
    {
        for(int i = 0; i < this.expenses.size(); i++)
        {
            System.out.println(this.expenses.get(i).getexpense());
            System.out.println(this.expenses.get(i).getname());
        }   
    }
    
    public void removefromexpense(BigDecimal Expense, String name)
    {
        
        for(int i = 0; i < this.expenses.size(); i++)
        {
           if(this.expenses.get(i).getexpense() == Expense && expenses.get(i).getname() == name)
           {
               this.expenses.remove(i);
           }
        }
        
    }
    
    public Expense getExpense(int index)
    {
        return expenses.get(index);
    }
}
