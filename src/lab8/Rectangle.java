package lab8;

public class Rectangle {
	
	private int width;
	private int height;

	Rectangle(){
	System.out.println("�������������� �� ���������: ������=25, ������=10�");	
	width=25;
	height=10;
	}
	Rectangle(int w,int h){
		if(w>=0&&w<=30&&h>=0&&h<=30){
			width=w;
			height=h;	
			System.out.println("������ ������������� � �������:"+w+" � �������:"+h);
			}
		else{
			System.out.println("������ ������ � ������ ������ ���� �� 0 �� 30");	
		
		}
	}
	public int getArea (){
		return 	width*height;
	}
	public void draw(){
	for(int i=0;i<height;i++){
		
		for(int j=0;j<width;j++){
			System.out.print("*");	
		}
		System.out.print("\n");
	}
		
		
	}
}
