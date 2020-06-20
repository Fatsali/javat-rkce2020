package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		//Bölme iþlmi yapan bir program yazalým
		int num1=0;
		int num2=3;
		try {
		System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sýfýr ile bölme yapýlmaz");
		}catch(Exception e) {
			System.out.println("Her exceptioni yakala");
		}
		//ArithmaticException run time exception . matematik kurallarýna uygun olmayan bir iþlem yapýldýðýnda bu exception alýnýr. 
		
		
		//try dan sonra 1 den fazla catch kullanabilirsiniz ama üstteki catch alttaki catchin childi olmalýdýr. 
		//catch leri Specific den
	}

}
