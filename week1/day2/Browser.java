package week1.day2;

public class Browser {
	
	private String launchBrowser(String browserName) {
		return browserName;
		

	}
	private void loadUrl() {
		System.out.println("firefox");

	}
	public static void main(String[] args) {
		
		Browser b= new Browser();
			System.out.println(b.launchBrowser("chrome"));
			b.loadUrl();
		
	}

}
