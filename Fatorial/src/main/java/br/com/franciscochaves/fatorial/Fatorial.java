package br.com.franciscochaves.fatorial;

public class Fatorial {

	public int fat(int n) {
		int fatorial = 1;

		for (int i = 2; i <= n; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

	public int fatorialRecursivo(int fatRec) {
		if (fatRec <= 1) {
			return 1;
		}
		return (fatRec * fatorialRecursivo(fatRec - 1));
	}

}
