// Класс Palindrome определяет является ли слово палиндромом
public class Palindrome {
	public static void main(String[] args) {
		// Цикл перебирает слова переданные в аргумент args и вызывает функцию isPalindrome
		// Если возвращаемое значение true - слово палиндром
		// false - слово не палиндром
		for (String s : args) {
			if (isPalindrome(s)) {
				System.out.println(s + " палиндром");
			} else {
				System.out.println(s + " не палиндром");
			}
		}

	}

	// функция возвращает true/false с помощью метода equals определяется, равна ли передананная строка, строке возвращаемой из функции reverseString
	public  static  boolean  isPalindrome(String  s){
		return s.equals(reverseString(s));
	}

	// Функция проходит от конца длинны строки посимвольно до 0, и переписывает символы в новую строку и возвращает это значение, тем самым переварачиваем строку
	public static String reverseString(String s){
		String reverseS = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverseS = reverseS + s.charAt(i);
		}
		return reverseS;
	}
}
