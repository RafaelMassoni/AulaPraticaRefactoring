import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getCustomer(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getFigures(each);
        }
        //add footer lines
        result += getResult(aCustomer);
        return result;
    }

    private String getCustomer(String name){
        return "Rental Record for " + name + "\n";
    }

    private String getFigures(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
    }

    private String getResult(Customer aCustomer){
        return "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n" +
        "You earned " + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    }
}