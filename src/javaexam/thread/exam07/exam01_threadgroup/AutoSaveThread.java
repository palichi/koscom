package javaexam.thread.exam07.exam01_threadgroup;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("save메소드 실행합니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
