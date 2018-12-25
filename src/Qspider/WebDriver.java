package Qspider;

public abstract interface WebDriver {
	
	void get();
	void refresh();
	void back();
	void forward();
	void close();
    
}
class chromeDriver implements WebDriver
{

	public void get() {
		System.out.println(" get the URL of web");
		
	}

	public void refresh() {
		System.out.println("refresh the browser ");
		
	}

	public void back() {
		System.out.println("back from current page ");
		
	}

	public void forward() {
		System.out.println("Forward page from current page");
		
	}

	public void close() {

		System.out.println("close the browser");
	}
	void extension()
	{
		System.out.println("file extension");
	}
	public static void main(String[] args) {
		
		chromeDriver cd = new chromeDriver();
		cd.extension();
		
	}
	
}


