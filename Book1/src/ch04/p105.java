package ch04;

import java.util.Scanner;

public class p105 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch (medal) {
			case "Gold" : 
				System.out.println("금메달입니다.");
				break;
			case "Silver" : 
				System.out.println("은메달입니다.");
				break;
			case "Bronze" :
				System.out.println("동메달입니다.");
				break;
			default :
				System.out.println("메달이 없습니다.");
				break;
		}
		
		int floor;
		Scanner sc = new Scanner(System.in);
		floor = sc.nextInt();
		switch (floor){
			case 1 : System.out.println(floor + "층은 약국입니다."); break;
			case 2 : System.out.println(floor + "층은 정형외과입니다."); break;
			case 3 : System.out.println(floor + "층은 피부과입니다."); break;
			case 4 : System.out.println(floor + "층은 치과입니다."); break;
			case 5 : System.out.println(floor + "층은 헬스클럽입니다."); break;
		}
		sc.close();
	}
}
