package fowler;

abstract public class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);
}

class ChildrensPrice extends Price {

	double getCharge(int daysRented){
    	double result = 1.5;
    	if (daysRented > 3)
        	result += (daysRented - 3) * 1.5;
    	return result;
	}
	
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
}

class NewReleasePrice extends Price {

	double getCharge(int daysRented){
    	return daysRented * 3;
	}
	
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
}

class RegularPrice extends Price {

	double getCharge(int daysRented){
    	double result = 2;
    	if (daysRented > 2)
        	result += (daysRented - 2) * 1.5;
    	return result;
	}
	
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
}

