// Класс Primes используется для поиска простых чисел от 2 до 100
public class Primes
{
	// В функции main цикл перебирает все числа от 2 до 100 и передает их в функцию IsPrimeи 
	// если возвращаемое значение true, то число выводится и является простым
	public static void main(String[] args) {
		for (int i = 2; i < 101; i++) {
			if (IsPrime(i)) {
				System.out.println(i);
			}
		}
	}
	// функция IsPrime првоеряет числа на простоту используя уикл от 2 до переданого числа
	// Если число делится на числа от 2 до n, то числа не является простым и возвращается false
	// иначе true
	public static boolean IsPrime(int n){
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}