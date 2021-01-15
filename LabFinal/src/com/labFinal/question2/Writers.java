package com.labFinal.question2;


import java.util.Date;



class Writers implements Runnable {
	private ReadersWriterInterface obj;
	private String flight;
	private static int j = 100;

	public Writers(ReadersWriterInterface obj, String flight) {
		this.obj = obj;
		this.flight = flight;
	}

	public void run() {
		Date date = new Date();
		System.out.println("Started Writer Thread : "
				+ Thread.currentThread().getName() + " at " + date.toString());
		try {
			obj.writer(flight, j++);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

