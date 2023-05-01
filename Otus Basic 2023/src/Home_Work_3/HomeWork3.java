package Home_Work_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		int correctCount = 0, wrongCount = 0;
		int numb = 0;
		boolean mistake = false;

		String[] questions = new String[4];
		questions[0] = "1. Чем определяются свойства сварного соединения?";
		questions[1] = "2. С какой целью выполняют разделку кромок?";
		questions[2] = "3. В каком порядке проводится аттестация сварщиков?";
		questions[3] = "4. При выполнении ручной дуговой сварки непровары возникают из-за:";

		String[][] answerOptions = new String[4][3];
		answerOptions[0][0] = "1) Свойствами металла шва, линии сплавления с основным металлом и зоны термического влияния;";
		answerOptions[0][1] = "2) Техническими характеристиками использованных электродов;";
		answerOptions[0][2] = "3) Свойствами металла линии сплавления и зоны термического влияния;";
		answerOptions[1][0] = "1) Для экономии металла;";
		answerOptions[1][1] = "2) Для более удобного проведения сварочных работ;";
		answerOptions[1][2] = "3) Для обеспечения провара на всю глубину;";
		answerOptions[2][0] = "1) По решению аттестационной комиссии;";
		answerOptions[2][1] = "2) Сначала теоретическая часть экзамена, а затем практическая;";
		answerOptions[2][2] = "3) Сначала практическая часть экзамена, затем теоретическая;";
		answerOptions[3][0] = "1) Высокой скорости выполнения работ, недостаточной силы сварочного тока;";
		answerOptions[3][1] = "2) Малой скорости выполнения работ, чрезмерно большой силы сварочного тока;";
		answerOptions[3][2] = "3) Неправильного подбора электродов, чрезмерно большой силы сварочного тока;";

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
						System.out.println("Некорректный ввод!\n" + "Введите цифры от 1 до 3");
						numb = answer.nextInt();
					}
				} catch (InputMismatchException e) {
					System.out.println("Ответ должен содеражать цифровое значение в диапазоне от 1 до 3");
					continue second;
				}
				System.out.println("Ваш ответ:" + " " + numb);
				if (numb == rightAnswersIndex[i]) {
					correctCount = correctCount + 1;
					System.out.println("Правильно");
				} else {
					wrongCount = wrongCount + 1;
					System.out.println("Неправильно");
				}
				continue outer;
			}
		}
		System.out.println(
				"Результат: правильных ответов - " + correctCount + ", неправильных ответов - " + wrongCount + ".");
	}
}