package com.dbs.paymentsapp.service;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;


@Component
public class NameChecker {
	

	public boolean checker(String phrase) throws IOException {
		Scanner fileScanner = new Scanner(new File("C:\\Users\\Administrator\\Downloads\\sdnlist.txt"));
		int lineCount =0;
		boolean flag = true;
		
		Pattern pattern = Pattern.compile(phrase,Pattern.CASE_INSENSITIVE);
		Matcher matcher = null;
		
		while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			lineCount++;
			matcher = pattern.matcher(line);
			if(matcher.find()) {
				flag = false;
			}
			
		}
		return flag;
		
	}

}
