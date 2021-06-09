package com.training.enumExample;

//enum Size {
//	   SMALL("yse"), MEDIUM, LARGE, EXTRALARGE;
//	   
//	   String s;
//	   Size() {
//		   
//	   }
//	   
//	    Size(String s) {
//		   this.s = s;
//	   }
//	}
//-------------------------------------------------------------------------------------
//enum Size {
//	SMALL, MEDIUM, LARGE, EXTRALARGE
//}
//
//class Test {
//	Size pizzaSize;
//
//	public Test(Size pizzaSize) {
//		this.pizzaSize = pizzaSize;
//	}
//
//	public void orderPizza() {
//		switch (pizzaSize) {
//		case SMALL:
//			System.out.println("I ordered a small size pizza.");
//			break;
//		case MEDIUM:
//			System.out.println("I ordered a medium size pizza.");
//			break;
//		case LARGE:
//			System.out.println("I ordered a large size pizza.");
//			break;
//		case EXTRALARGE:
//			System.out.println("I ordered a extra large size pizza.");
//			break;
//		default:
//			System.out.println("I don't know which one to order.");
//			break;
//		}
//	}
//}
//---------------------------------------------------------------------------------------
//
//enum Level{
//	HIGH(3) {
//		@Override
//		public String getLowerCase() {
//			return HIGH.toString().toLowerCase();
//		}
//	},
//	MEDIUM(2) {
//		@Override
//		public String getLowerCase() {
//			return MEDIUM.toString().toLowerCase();
//		}
//	},
//	LOW(1) {
//		@Override
//		public String getLowerCase() {
//			return LOW.toString().toLowerCase();
//		}
//	};
//	
//	private final int levelCode;
//	Level(int code){
//		this.levelCode=code;
//	}
//	
//	public int getLevelCode() {
//		return levelCode;
//	}
//	
//	public abstract String getLowerCase();
//}

//------------------------------------------

//
//public class EnumExample {
//	public static void main(String[] args) {
////		Test t1 = new Test(Size.LARGE);
////		   t1.orderPizza();
////		   Test t2 = new Test(Size.MEDIUM);
////		   t2.orderPizza();
////		   Test t3 = new Test(Size.EXTRALARGE);
////		   t3.orderPizza();
////		   Test t4 = new Test(Size.LARGE);
////		   t4.orderPizza();
////		------------------------------------------
//		
//		
//		
//	}
//}



class EnumExample {
	public enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}	

	Day day;

	public EnumExample(Day day) {
		this.day=day;
	}


	public void tellMeTheDay() {
		switch(day) {
		case MONDAY:
			System.out.println("Monday is bad");
			break;
		case FRIDAY:
			System.out.println("Friday is better");
			break;
		case SATURDAY:
			System.out.println("Weekend party");
			break;
		case SUNDAY:
			System.out.println("RELAX");
			break;
		default:
			System.out.println("Default case");
		}
	}

	public static void main(String[] args) {

		EnumExample e1=new EnumExample(Day.FRIDAY);
		e1.tellMeTheDay();

	}
}
