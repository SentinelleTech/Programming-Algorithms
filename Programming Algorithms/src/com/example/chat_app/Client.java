package com.example.chat_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	Socket socket;
	BufferedReader br;
	PrintWriter writer;
	Scanner s;

	public Client() {
		
		try {
			socket = new Socket("127.0.0.1", 5000);
		
			writer = new PrintWriter(socket.getOutputStream());
		
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			s = new Scanner(System.in);
			
			Thread sender = new Thread(new Runnable(){

				String message;
				
				@Override
				public void run() {
					
					while(true){
						
						message = s.nextLine();
						writer.println(message);
						writer.flush();
						
					}
					
				}
				
			});
			
			sender.start();
			
			Thread receiver = new Thread(new Runnable(){

				String msg;
				
				@Override
				public void run() {
					
					try {
						msg = br.readLine();
					
					
						while(msg != null){
							
							System.out.println("Server: " + msg);
							
							msg = br.readLine();
						}
						
						System.out.println("Server out of Range!");
					
						writer.close();
						socket.close();
					
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				
			});
			receiver.start();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public static void main(String[] args) {
		new Client();

	}

}
