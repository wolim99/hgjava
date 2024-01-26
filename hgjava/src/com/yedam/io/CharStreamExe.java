package com.yedam.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자기반 입출력

		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				br.readLine();
				String read = br.readLine(); // 한라인씩 읽기
				if (read == null) { // eof => null 반환
					break;
				}
				System.out.println(read);
			}
			br.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end of prog");
	}

	static void read() {
		Class cls = CharStreamExe.class;
		String path = cls.getResource("byteStreamExe.class").getPath();
		System.out.println(path);

		try {
			FileReader fr = new FileReader("/D:/git/hgjava/hgjava/src/com/yedam/io/byteStreamExe.java");
			while (true) {
				int read = fr.read();
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void write() {
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			while (true) {
				System.out.println("입력>>");
				String str = scn.nextLine();
				if (str.equals("stop")) {
					break;
				}
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
