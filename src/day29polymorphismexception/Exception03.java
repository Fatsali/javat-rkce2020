package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		//B�lme i�lmi yapan bir program yazal�m
		int num1=0;
		int num2=3;
		try {
		System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("S�f�r ile b�lme yap�lmaz");
		}catch(Exception e) {
			System.out.println("Her exceptioni yakala");
		}
		//ArithmaticException run time exception . matematik kurallar�na uygun olmayan bir i�lem yap�ld���nda bu exception al�n�r. 
		
		
		//try dan sonra 1 den fazla catch kullanabilirsiniz ama �stteki catch alttaki catchin childi olmal�d�r. 
		//catch leri Specific den
	}

}
