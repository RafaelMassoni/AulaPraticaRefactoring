public abstract class Price {
    public abstract int getPriceCode();
    
    public double getCharge(int daysRented){
        double returnAmount = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                returnAmount += 2;
                if (daysRented > 2)
                    returnAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                returnAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                returnAmount += 1.5;
                if (daysRented > 3)
                    returnAmount += (daysRented - 3) * 1.5;
                break;
        }
        return returnAmount;
    }
}