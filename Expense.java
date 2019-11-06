/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofengg;
import java.math.BigDecimal;

/**
 *
 * @author MarcoMalabag
 */
public class Expense {
    
    private BigDecimal expenses;
    private String name;

    public Expense(BigDecimal Expense, String name)
    {
        this.expenses = Expense;
        this.name = name;
    }

    public BigDecimal getexpense()
    {
         return this.expenses;
    }
    public String getname()
    {
        return name;
    }
}
