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
public class MonthlyIncome {
    
    private BigDecimal monthlysales;
    private ExpenseList expenses;
    
    
    public MonthlyIncome(ExpenseList expense, BigDecimal monthly)
    {
        this.expenses = expense;
        this.monthlysales = monthly;
    }
    
    public BigDecimal ComputeMonthly()
    {
        BigDecimal income;
        
        income = this.monthlysales;
        
        for(int i = 0; i < expenses.getsize(); i++)
        {
            income.subtract(expenses.getExpense(i).getexpense());
        }
        
        return income;
    }
}
