package user.enock.cont;

public class Contador {
	int num1;
	int num2;
	public void contar(int num1, int num2) throws Exception {
		if (num1 > num2) {
			throw new Exception("num2 deve ser maior que num1 ");
		} else {
			int cont = num2 - num1;
				for (int i = 0; i < cont; i++) {
					System.out.println(i+1);
				}System.out.println("");
		}

	}

}
