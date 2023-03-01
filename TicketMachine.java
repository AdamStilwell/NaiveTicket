/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;
    private Integer points;
    private Integer score;
    private Integer saving;
    

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public Integer getPrice()
    {
        return price;
    }
    
    public Integer setPrice(int ticketCost)
    {
        ticketCost = price;
        return ticketCost;
    }
    /**
     * Increase score by the given number of points.
     */
    public void increase(int points)
    {
        score = score + points;
        return;
    }
    
    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber()
    {
        return ticketNumber;
    }

    /**
     * Reduce price by the given amount.
     */
    public void discount(int amount)
    {
        int discount = amount;
        price = price - amount;
        saving = price / discount;
        return;
    }
    
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public Integer getBalance()
    {
        return balance;
    }

    public Integer getTotal()
    {
        return total;
    }
    
    /**
     * Receive an amount of money in cents from a customer.
     */
    public Integer insertMoney(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount: " + amount);
        
    }
    return balance;
}      
    
    
    public Integer calculateTotal(){
        total = balance + total;
        return total;
    }
    
    public Integer incrementTicketNumber(){
        ticketNumber++;
        return ticketNumber;
    }
    

    /**
     * Print a ticket and reduce the current balance to zero.
     */
    public String printTicket()
    {
        int budget = balance;
        if(budget > price)
        {
        //Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println(); 
        }
        else if(price > budget)
        {
            return "Too expensive.";
        }
        
        //Update the total colleceted with the balance.
        total = total + balance;
        //Clear the balance.
        balance = 0;
        return "The price of a ticket is: " + price + "cents."; 
    }
    
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
        return;
    }
    
    public void showPrice()
    {
        System.out.println("The price of a ticket is" + price + " cents.");
        return;
    }
    
    public void empty()
    {
        if(total <=0){
            total = 0;
        }
        return;
    }
}
