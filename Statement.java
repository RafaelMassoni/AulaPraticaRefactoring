import java.util.Enumeration;

public abstract class Statement {
    protected abstract String getCustomer(String name);
    protected abstract String getFigures(Rental each);
    protected abstract String getResult(Customer aCustomer);

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
}