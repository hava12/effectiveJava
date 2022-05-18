package item9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResources {

	//Try Finally를 사용한 코드
	static String firstLineOfFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			return br.readLine();
		}
	}

	static String firstLineOfFile(String path, String defaultValue) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			return br.readLine();
		} catch (IOException e) {
			return defaultValue;
		}
	}

	public static final int BUFFER_SIZE = 4;
	static void copy(String src, String dst) throws IOException {
		try (InputStream in = new FileInputStream(src);
			 OutputStream out = new FileOutputStream(dst)) {
				byte[] buf = new byte[BUFFER_SIZE];
				int n;
				while((n = in.read(buf)) >= 0) {
					out.write(buf, 0, n);
				}
		}
	}
}
