import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + name +
        "</EM></H1><P>\n";
    }

    private String getFigures(Rental each){
        return each.getMovie().getTitle()+ ": " +
            String.valueOf(each.getCharge()) + "<BR>\n";
    }

    private String getResult(Customer aCustomer){
        return "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
        "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    }
}