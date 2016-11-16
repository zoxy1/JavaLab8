package lab8;

public class DateThree {
	
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate(int day,int month,int year){
	if(year>=1000&&year<=10000){
		this.year=year;
	}
	else{
		System.out.println("Год должен быть в диапазоне от 1000 до 10000");
	}
	
	switch(month){
		case 1: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в январе должно быть от 1 до 31");	
		}
		break;
		case 2: this.month=month;
		if(year%4==0){
			if (day>=1&&day<=29){
				this.day=day;
			}
			else{
				System.out.println("Количество дней в феврале в високосный год должно быть от 1 до 29");	
			}
		}
		else{
			if (day>=1&&day<=28){
				this.day=day;
			}
			else{
				System.out.println("Количество дней в феврале не в високосный год должно быть от 1 до 28");	
			}
		}
		break;
		case 3: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в марте должно быть от 1 до 31");	
		}
		break;
		case 4: this.month=month;
		if (day>=1&&day<=30){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в апреле должно быть от 1 до 30");	
		}
		break;	
		case 5: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в мае должно быть от 1 до 31");	
		}
		break;	
		case 6: this.month=month;
		if (day>=1&&day<=30){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в июне должно быть от 1 до 30");	
		}
		break;
		case 7: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в июле должно быть от 1 до 31");	
		}
		break;
		case 8: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в августе должно быть от 1 до 31");	
		}
		break;
		case 9: this.month=month;
		if (day>=1&&day<=30){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в сентябре должно быть от 1 до 30");	
		}
		break;
		case 10: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в октябре должно быть от 1 до 31");	
		}
		break;
		case 11: this.month=month;
		if (day>=1&&day<=30){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в ноябре должно быть от 1 до 30");	
		}
		break;
		case 12: this.month=month;
		if (day>=1&&day<=31){
			this.day=day;
		}
		else{
			System.out.println("Количество дней в декабре должно быть от 1 до 31");	
		}
		break;
	}
		
	}
	public void displayDate(){
	System.out.println("Сегодня : "+day+"."+month+"."+year+"г.");	
	}
}	
	
	