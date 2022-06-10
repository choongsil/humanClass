import java.awt.Toolkit;
/*
public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<20 ; i++) {
			tk.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}

	}

}
*/
public class BeepTask extends Thread{
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<20 ; i++) {
			tk.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}