package home.javabegin.training.spring.impls.toshiba;

import home.javabegin.training.spring.interfaces.Head;

public class ToshibaHead implements Head{
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

	public void init() {
		System.out.println("Init ToshibaHead");
	}

	public void destroy() {
		System.out.println("Destroy ToshibaHead");
	}
}
