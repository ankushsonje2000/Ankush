package Day;

public class tr1 {

	public static void main(String[] args) {

		String d = "Maharashtra";
		System.out.println(d);
		
		System.out.println(d.endsWith("tra")); //true
		
		System.out.println(d.endsWith("ta")); //false
		
		System.out.println(d.endsWith("a"));

		System.out.println(d.endsWith("s"));
		
		String s = "ranjangoan";
		System.out.println(s);
		
		System.out.println(s.startsWith("mha")); //false
		System.out.println(s.startsWith("r")); 
		System.out.println(s.startsWith("ran")); 

	}

}
