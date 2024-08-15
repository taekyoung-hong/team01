package notepad;

import java.util.Random;
import java.util.Scanner;

public class arrays_baseball {

	public static void main(String[] args) {
		

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		   int com1 = ran.nextInt(9) + 1; // 1부터 9까지의 랜덤한 수
           int com2;
           do {
               com2 = ran.nextInt(9) + 1; // 부터 9까지의 랜덤한 수
           } while (com2 == com1); // 첫 번째 수와 중복되는 경우 다시 뽑기

           int com3;
           do {
               com3 = ran.nextInt(9) + 1; // 부터 9까지의 랜덤한 수
           } while (com3 == com1 || com3 == com2); // 첫 번째와 두 번째 수와 중복되는 경우 다시 뽑기
           
           int[] computer = new int[3];
           computer[0] = com1;
           computer[1] = com2;
           computer[2] = com3;
           
           
           System.out.println("랜덤으로 생성된 세 자리 숫자: " + com1 + com2 + com3); 
            
           System.out.println();
           
           System.out.println("=================게임시작==================");
           System.out.println("=================중복없음==================");
           

           System.out.println();
            
           int[] user = new int[3];
           
       
      	   System.out.print("첫번째 : ");
           int user1 = scan.nextInt();
           System.out.print("두번쨰 : ");
           int user2 = scan.nextInt();
           System.out.print("세번째 : ");
           int user3 = scan.nextInt();
           // 사용자 입력값 출력
           System.out.println("입력한 숫자 " + user1 + user2 + user3);
		
           user[0] = user1;
           user[1] = user2;
           user[2] = user3;
           
		   for (int i = 0; i < computer.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (user1 == com1) { System.out.println("1S");
				} else if (com1 == user2 || com1 == user3 ) { System.out.println("1B");	}

				if (user2 == com2) { System.out.println("1S");
				} else if (com1 == user2 || com1 == user3 ) { System.out.println("1B");	}
				{ System.out.println("1OUT");

				if (user2 == com2) { System.out.println("1S");
				} else if (com1 == user2 || com3 == user2 ) { System.out.println("1B");	}
				else { System.out.println("1OUT");}	
			   
				if (user3 == com3) { System.out.println("1S");
				} else if (com3 == user2 || com3 == user1 ) { System.out.println("1B");	}
				else { System.out.println("1OUT");}	
				
			
			}
		
			System.out.println("계속하시겠습니까? (Y/N)");
			String str = "";
			if (str.equalsIgnoreCase("y")) { continue;	}
			else { break; }
			
			
			
			
			}
		
	
	
	
	
           
		   }
           
           
           
           
           
	}
	
	
	
}
