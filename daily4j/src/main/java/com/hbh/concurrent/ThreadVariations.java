package com.hbh.concurrent;

import java.util.concurrent.TimeUnit;

/***
 * 使用内部类继承Thread类
 *
 */
class InnerThread1 {
	private int countDown = 5;
	private Inner inner;

	private class Inner extends Thread {
		Inner(String name) {
			super(name);
			start();
		}

		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
					sleep(10);
				}
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			}
		}

		public String toString() {
			return getName() + ":" + countDown;
		}
	}

	public InnerThread1(String name) {
		inner = new Inner(name);
	}
}

/**
 * 使用构造器创建线程
 */
class InnerThread2 {
	private int countDown = 5;
	private Thread thread;

	public InnerThread2(String name) {
		thread = new Thread(name) {
			public void run() {
				try {
					while (true) {
						System.out.println(this);
						if (--countDown == 0) {
							return;
						}
						sleep(10);
					}
				} catch (InterruptedException e) {
					System.out.println("sleep()");
				}
			}

			public String toString() {
				return getName() + ":" + countDown;
			}
		};
		thread.start();
	}
}

/***
 * 内部类实现Runnble接口
 * 
 * @author Administrator
 *
 */
class InnerRunnale1 {
	private int countDown = 5;
	private Inner inner;

	private class Inner implements Runnable {
		Thread t;

		Inner(String name) {
			t = new Thread(this, name);
			t.start();
		}

		@Override
		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
					TimeUnit.MILLISECONDS.sleep(10);
				}
			} catch (InterruptedException e) {
				System.out.println("sleep()");
			}
		}

		public String toString() {
			return t.getName() + ":" + countDown;
		}

	}

	public InnerRunnale1(String name) {
		inner = new Inner(name);
	}
}

class InnerRunnale2 {
	private int countDown = 5;
	private Thread t;

	public InnerRunnale2(String name) {
		t = new Thread() {
			public void run() {
				try {
					while (true) {
						System.out.println(this);
						if (--countDown == 0) {
							return;
						}
						TimeUnit.MILLISECONDS.sleep(10);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			public String toString() {
				return Thread.currentThread().getName() + ":" +countDown;
			}
		};

	}
}
class ThreadMethod {
	private int countDown = 5;
	private Thread thread;
	private String name;
	public ThreadMethod(String name) {
		this.name = name;
	}
	public void runTask() {
		if(thread == null) {
			thread = new Thread(name) {
				public void run() {
					try {
						while(true) {
							System.out.println(this);
							if(--countDown == 0) {
								return;
							}
							sleep(10);
						}
					} catch (InterruptedException e) {
						System.out.println("sleep()");
					}
				}
				public String toString() {
					return getName() + ":" + countDown;				}
			};
		}
	}
}
public class ThreadVariations {
	public static void main(String[] args) {
		new InnerThread1("i1");
		new InnerThread2("t2");
		new InnerRunnale1("r1"); 
		new InnerRunnale2("r2");
		new ThreadMethod("tm");
	}
}
