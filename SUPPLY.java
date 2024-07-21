package placement_training;
import java.util.Scanner;

public class SUPPLY {
	private int code;
	private String FoodName;
	private String Sticker;
	private String FoodType;
	
	private void GetType() {
		switch(Sticker.toLowerCase()) {
		case "green":
			FoodType = "Vegetarian";
			break;
		case "yellow":
			FoodType = "Contains Eggs";
			break;
		case "red":
			FoodType = "Non Vegetarian";
			break;
		default:
			FoodType = "Unkown";
			break;
		}
	}
	
	public void FoodIn() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Code : ");
		code = s.nextInt();
		s.nextLine();
		System.out.println("Enter Food Name : ");
		FoodName = s.nextLine();
		System.out.println("Enter Sticker : ");
		Sticker = s.nextLine();
		
		GetType();
	}
	
	public void FoodOut() {
		System.out.println("Code : "+ code);
		System.out.println("Food Name : "+ FoodName);
		System.out.println("Sticker : "+ Sticker);
		System.out.println("Food Type : "+ FoodType);
	}
	
	public static void main(String[] args) {
		SUPPLY supply = new SUPPLY();
		supply.FoodIn();
		supply.FoodOut();
	}
}