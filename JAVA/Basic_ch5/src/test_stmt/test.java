package test_stmt;

public class test {

	public static void main(String[] args) {
	
		String [] old = {"java","array","copy"};
		String [] news = new String[5];
		System.arraycopy(old, 0, news, 0, old.length);
		for(int i=0;i<news.length;i++)
			System.out.println(news[i]);
	}

}
