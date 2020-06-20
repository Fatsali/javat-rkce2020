package day30exceptions;

public class TryCatch05 {

	public static void main(String[] args) {
		try {
			hop();
		}catch (Exception e) {
			e.printStackTrace();
			//printStackTrace() methodu Exception larýn nerede oluþtuðunun detaylý bilgisini verir. 
			//Exception satýrlarýný oluþum sýrasýna göre console de gösterir.
		}

	}
 
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
