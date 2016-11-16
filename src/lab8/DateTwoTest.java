package lab8;
public class DateTwoTest {

  public static void main(String args[]) {
          
	  DateTwo dateOne1=new DateTwo();
	  
	  /* ошибки возникнут в следующем закомментированном 
	  коде,т. к. мы пытаемся получить доступ 
	  к закрытым(private) полям класса DateTwo, данные поля 
	  доступны только в пределах класса DateTwo.
	  dateOne1.day=30;
	  dateOne1.month=9;
	  dateOne1.year=2016;
	  System.out.println(dateOne1.day);
	  System.out.println(dateOne1.month);
	  System.out.println(dateOne1.year); 
	  */
  }// end main
    
} // end class

