package �������̽�����;

import java.util.Random;

public class PlusGame implements IGame {
	protected Random ran;
	protected int num1;
	protected int num2;
	
	
	
	
	@Override
	public void makeRandom() {
		ran = new Random();
		num1 = ran.nextInt(9)+1;
		num2 = ran.nextInt(9)+1;
		
	}

	@Override
	public String getQuizMsg() {
		// String result = num1 + "+" + num2 + "=";
		return num1 +"+"+ num2 +"= ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		return num1 + num2 == answer; // �񱳿����ڴ� ��������� boolean �ǵ����ش�
			
	}

}
