package lab8;
public class DateThreeTest {

	public static void main(String args[]){
	  DateThree dateThree=new DateThree();
	  dateThree.setYear(2016);
	  dateThree.setMonth(10);
	  dateThree.setDay(14);
	  
	  System.out.println(" The date is " + dateThree.getDay() + "."
        + dateThree.getMonth() + "." + dateThree.getYear());
	  dateThree.setDate(29, 2, 2004);
	  dateThree.displayDate();
	}
} // end class
