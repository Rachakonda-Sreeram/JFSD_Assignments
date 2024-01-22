package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) {
		String s = "";
		String n = "N";
		String name = "         Sreeram            ";
		System.out.println(s.isBlank()); // true
		System.out.println(n.isBlank()); // false
		System.out.println(name);
		System.out.println(name.length()); // 28
		System.out.println(name.strip());
		System.out.println(name.strip().length());  //7
		System.out.println(name.stripLeading());
		System.out.println(name.stripLeading().length());// 19
		System.out.println(name.stripTrailing());
		System.out.println(name.stripTrailing().length());
		try {
			Path path = Paths.get("resources/Input.txt");
			String data = Files.readString(path);
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
