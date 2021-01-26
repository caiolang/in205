class Tp1Exo4 {
	/*
	 * Exercice 4 du TP1 vous pouvez par exemple utiliser la commande suivante:
	 * user@machine$> javac Tp1Exo4.java ; java Tp1Exo4
	 */

	public static void print(Object o) {
		System.out.println(o);
	}

	public static boolean estPalindrome(String word) {
		
		int len = word.length();
		int aux=len-1;
		
		String reverse = new String();
		
		for(int i=0;i<(len);i++) {
//			System.out.append("\n "+word.charAt(aux)+ " ");
			reverse+=word.charAt(aux);
			aux--;
		}
		
//		System.out.print("\n"+word + " ");
//		System.out.print("\n"+reverse + " ");
		
//		if( word.equals(reverse)) {
//			return true;
//		}else {
//			return false;
//		}
		
		return word.equals(reverse);
	}

	public static void main(String[] args) {
		// Exercice 4
		/*
		 * Boucles et chaînes de caractères
		 */
		{// les chaînes de caractères
			String s = "Hello";
			s += " World!";
			print(s);

			char c = 'e';
			print(c == s.charAt(1));
			print(s.length());
		}
		{// boucle while, do-while
			int i = 0, sum = 0;
			String s = "abc";
			while (i < s.length()) {
				int diff = s.charAt(i) - 'a';
				sum = sum + diff;
				i++;
			}
			print(sum);

			int n = 2;
			do {
				n++;
			} while (n < 2);
			print("n:" + n);
		}
		{// boucle for
			String chiffres = "0123456789";
			String pairs = "";
			for (int i = 0; i < chiffres.length(); i = i + 2) {
				pairs = pairs + chiffres.charAt(i);
			}
			print("chiffres pairs: " + pairs);
		}
		{// switch
			// Math.random() est une fonction qui retourne un double aléatoire entre 0 et 1.
			int randomChoice = (int) (Math.random() * 4);
			switch (randomChoice) {
			case 0:
				print("Math.random() generated a value between 0 and 0.25");
				break;
			case 1:
				print("Math.random() generated a value between 0.25 and 0.5");
			case 2:
				print("Math.random() generated a value between 0.25 and 0.75");
				break;
			default:
				print("Math.random() generated a value between 0.75 and 1");
			}
		}

		/*
		 * Exercez-vous en codant la fonction estPalindrome qui indique si une chaîne de
		 * charactère est "symétrique". (la fonction est déclarée au dessus du main)
		 */
		boolean pizzaEstUnPalindrome = estPalindrome("pizza");
		print(pizzaEstUnPalindrome ? "pizza est un palindrome" : "pizza n'est pas un palindrome");
		boolean kayakEstUnPalindrome = estPalindrome("kayak");
		print(kayakEstUnPalindrome ? "kayak est un palindrome" : "kayak n'est pas un palindrome");
		boolean EstUnPalindrome = estPalindrome("ovo");
		print(EstUnPalindrome ? "ovo est un palindrome" : "ovo n'est pas un palindrome");
		EstUnPalindrome = estPalindrome("arara");
		print(EstUnPalindrome ? "arara est un palindrome" : "arara n'est pas un palindrome");
		EstUnPalindrome = estPalindrome("olho");
		print(EstUnPalindrome ? "olho est un palindrome" : "olho n'est pas un palindrome");
	}
}