package Home_Work_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		int correctCount = 0, wrongCount = 0;
		int numb = 0;
		boolean mistake = false;

		String[] questions = new String[4];
		questions[0] = "1. ��� ������������ �������� �������� ����������?";
		questions[1] = "2. � ����� ����� ��������� �������� ������?";
		questions[2] = "3. � ����� ������� ���������� ���������� ���������?";
		questions[3] = "4. ��� ���������� ������ ������� ������ ��������� ��������� ��-��:";

		String[][] answerOptions = new String[4][3];
		answerOptions[0][0] = "1) ���������� ������� ���, ����� ���������� � �������� �������� � ���� ������������ �������;";
		answerOptions[0][1] = "2) ������������ ���������������� �������������� ����������;";
		answerOptions[0][2] = "3) ���������� ������� ����� ���������� � ���� ������������ �������;";
		answerOptions[1][0] = "1) ��� �������� �������;";
		answerOptions[1][1] = "2) ��� ����� �������� ���������� ��������� �����;";
		answerOptions[1][2] = "3) ��� ����������� ������� �� ��� �������;";
		answerOptions[2][0] = "1) �� ������� �������������� ��������;";
		answerOptions[2][1] = "2) ������� ������������� ����� ��������, � ����� ������������;";
		answerOptions[2][2] = "3) ������� ������������ ����� ��������, ����� �������������;";
		answerOptions[3][0] = "1) ������� �������� ���������� �����, ������������� ���� ���������� ����;";
		answerOptions[3][1] = "2) ����� �������� ���������� �����, ��������� ������� ���� ���������� ����;";
		answerOptions[3][2] = "3) ������������� ������� ����������, ��������� ������� ���� ���������� ����;";

		int[] rightAnswersIndex = new int[4];
		rightAnswersIndex[0] = 1;
		rightAnswersIndex[1] = 3;
		rightAnswersIndex[2] = 3;
		rightAnswersIndex[3] = 1;

		outer: 
			for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}
			second: 
				while (!mistake) {
				try {
					Scanner answer = new Scanner(System.in);
					numb = answer.nextInt();
					while (numb < 0 | numb > 3 | numb == 0) {
						System.out.println("������������ ����!\n" + "������� ����� �� 1 �� 3");
						numb = answer.nextInt();
					}
				} catch (InputMismatchException e) {
					System.out.println("����� ������ ���������� �������� �������� � ��������� �� 1 �� 3");
					continue second;
				}
				System.out.println("��� �����:" + " " + numb);
				if (numb == rightAnswersIndex[i]) {
					correctCount = correctCount + 1;
					System.out.println("���������");
				} else {
					wrongCount = wrongCount + 1;
					System.out.println("�����������");
				}
				continue outer;
			}
		}
		System.out.println(
				"���������: ���������� ������� - " + correctCount + ", ������������ ������� - " + wrongCount + ".");
	}
}