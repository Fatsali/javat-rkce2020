package day30exceptions;

public class TryCatch05 {

	public static void main(String[] args) {
		try {
			hop();
		}catch (Exception e) {
			e.printStackTrace();
			//printStackTrace() methodu Exception lar�n nerede olu�tu�unun detayl� bilgisini verir. 
			//Exception sat�rlar�n� olu�um s�ras�na g�re console de g�sterir.
		}

	}
 
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
