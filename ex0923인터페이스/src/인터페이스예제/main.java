package �������̽�����;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// ����� ���
		// ����Ƚ�� üũ, 5������ �ݺ�
		Scanner sc = new Scanner(System.in);
		PlusGame p1 = new PlusGame();
//		GameDummy p1 = new GameDummy();
		int count = 0; // ������ ������ üũ�ϴ� ����

		// 1. �� 5������ ����
		for (int i = 0; i < 5; i++) {
			// 2. ���� �����ϴ� ���
			p1.makeRandom();
			// 3. ���� ���
			
			for (int j = 0; j < 3; j++) {
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();
				// 4. �� ������ ������ ���� �� �ִ� ��ȸ�� 3��
				if (p1.checkAnswer(answer)) {
					// ������ �����
					count++;
					break;
				} else {
					// ����
					System.out.println("�����Դϴ�.");
				}
			}
		}
		// 5. ���� ���� Ƚ���� ���
		System.out.println("������ ������ " + count + "�� �Դϴ�.");

		System.out.println("dddddd");
	}

}
