package lab8;
public class RectangleTest {

  public static void main(String args[]){
	  Rectangle r1=new Rectangle();
	  System.out.println("��� ������ �������������:");
	  r1.draw();
	  Rectangle r2=new Rectangle(5,5);
	  System.out.println("��� ������ �������������:");
	  r2.draw();
	  System.out.println("������� ������� ��������������:"+r2.getArea());
  }// end main
} // end class
