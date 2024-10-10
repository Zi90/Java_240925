package day08;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * menu
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * WordController 메서드 구현
		 * map을 이용하여 단어 등록
		 * 기본 단어 등록(5가지 등록)
		 * main에서 메뉴 반복처리
		 */
		
		WordController wordController = new WordController();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료");
			System.out.println("menu >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				wordController.insertWord(scan);
				break;
			case 2:
				wordController.searchWord(scan);
				break;
			case 3:
				wordController.modifyWord(scan);
				break;
			case 4:
				wordController.printWord(scan);
				break;
			case 5:
				wordController.deleteWord(scan);
				break;
			case 6:
				System.out.println("단어장을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 6);
		
		scan.close();
		
	}

}
