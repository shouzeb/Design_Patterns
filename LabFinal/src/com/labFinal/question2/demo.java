package com.labFinal.question2;


public class demo {

	public static void main(String[] args) {
		ReentrantRWLock f1 = new ReentrantRWLock();
		
		
		System.out.println("\n\n\t\tFlight-1");
			Thread[] users = new Thread[15];
			String flight = "Flight-1"; 

			users[0] = new Thread(new Writers(f1, flight));
			users[1] = new Thread(new Readers(f1, flight));
			users[2] = new Thread(new Writers(f1, flight));
			users[3] = new Thread(new Readers(f1, flight));
			users[4] = new Thread(new Readers(f1, flight));
			users[5] = new Thread(new Readers(f1, flight));
			users[6] = new Thread(new Readers(f1, flight));
			users[7] = new Thread(new Readers(f1, flight));
			users[8] = new Thread(new Writers(f1, flight));
			users[9] = new Thread(new Readers(f1, flight));
			users[10] = new Thread(new Writers(f1, flight));
			users[11] = new Thread(new Writers(f1, flight));
			users[12] = new Thread(new Readers(f1, flight));
			users[13] = new Thread(new Readers(f1, flight));
			users[14] = new Thread(new Readers(f1, flight));

			for (int i = 0; i < 15; i++) {
				users[i].start();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < 15; i++) {
				try {
					users[i].join();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			
			
			System.out.println("\n\n\t\tFlight-2");
			Thread[] users1 = new Thread[15];
			String flight1 = "Flight-2"; 

			users1[0] = new Thread(new Writers(f1, flight1));
			users1[1] = new Thread(new Readers(f1, flight1));
			users1[2] = new Thread(new Writers(f1, flight1));
			users1[3] = new Thread(new Readers(f1, flight1));
			users1[4] = new Thread(new Readers(f1, flight1));
			users1[5] = new Thread(new Readers(f1, flight1));
			users1[6] = new Thread(new Readers(f1, flight1));
			users1[7] = new Thread(new Readers(f1, flight1));
			users1[8] = new Thread(new Writers(f1, flight1));
			users1[9] = new Thread(new Readers(f1, flight1));
			users1[10] = new Thread(new Writers(f1, flight1));
			users1[11] = new Thread(new Writers(f1, flight1));
			users1[12] = new Thread(new Readers(f1, flight1));
			users1[13] = new Thread(new Readers(f1, flight1));
			users1[14] = new Thread(new Readers(f1, flight1));

			for (int i = 0; i < 15; i++) {
				users1[i].start();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < 15; i++) {
				try {
					users1[i].join();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			
			System.out.println("\n\n\t\tFlight-3");
			Thread[] users2 = new Thread[15];
			String flight2 = "Flight-3"; 

			users2[0] = new Thread(new Writers(f1, flight2));
			users2[1] = new Thread(new Readers(f1, flight2));
			users2[2] = new Thread(new Writers(f1, flight2));
			users2[3] = new Thread(new Readers(f1, flight2));
			users2[4] = new Thread(new Readers(f1, flight2));
			users2[5] = new Thread(new Readers(f1, flight2));
			users2[6] = new Thread(new Readers(f1, flight2));
			users2[7] = new Thread(new Readers(f1, flight2));
			users2[8] = new Thread(new Writers(f1, flight2));
			users2[9] = new Thread(new Readers(f1, flight2));
			users2[10] = new Thread(new Writers(f1, flight2));
			users2[11] = new Thread(new Writers(f1, flight2));
			users2[12] = new Thread(new Readers(f1, flight2));
			users2[13] = new Thread(new Readers(f1, flight2));
			users2[14] = new Thread(new Readers(f1, flight2));

			for (int i = 0; i < 15; i++) {
				users2[i].start();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < 15; i++) {
				try {
					users2[i].join();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			
			System.out.println("Completed...");


	}

}
