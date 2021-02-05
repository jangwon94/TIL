package test.exception2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int result=0;
		try {
			result = c.divide(50,0);
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(result);
			System.out.println("아주중요한일시작");
		}

	}

}
