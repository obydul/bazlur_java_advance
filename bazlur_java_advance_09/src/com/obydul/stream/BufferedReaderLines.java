package com.obydul.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Stream;

public class BufferedReaderLines {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.javatpoint.com/java-tutorial");
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			Stream<String> lines = reader.lines();
			lines.limit(10).forEach(val -> System.out.println(val));
			
			// short code
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
