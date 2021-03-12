public class TextStatement extends Statement {
    protected String getCustomer(String name){
        return "Rental Record for " + name + "\n";
    }

    protected String getFigures(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
    }

    protected String getResult(Customer aCustomer){
        return "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n" +
        "You earned " + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    }
}