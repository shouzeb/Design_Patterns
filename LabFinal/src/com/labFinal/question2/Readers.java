package com.labFinal.question2;


import java.util.Date;




class Readers implements Runnable {
	private ReadersWriterInterface obj;
	private String flight;

	public Readers(ReadersWriterInterface obj, String flight) {
		this.obj = obj;
		this.flight = flight;
	}

	public void run() {
		Date date = new Date();
		System.out.println("Started Reader Thread : "
				+ Thread.currentThread().getName() + " at " + date.toString());
		try {
			obj.reader(flight);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
