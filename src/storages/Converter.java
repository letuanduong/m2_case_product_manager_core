package storage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter implements IConverter {

	private String[] arr = new String[10];
	private Pattern[] p = new Pattern[10];
	private String[] converter = new String[10];
	
	public void regax(String line) {
		p[0] = Pattern.compile("category: \\D+[;]");
		p[1] = Pattern.compile("id: \\d+[;]");
		p[2] = Pattern.compile("cost: \\d+[.]\\d+[;]");
		p[3] = Pattern.compile("name: \\D+[;]");
		p[4] = Pattern.compile("Samsung");
		p[5] = Pattern.compile("data\\d+");
		p[6] = Pattern.compile("\\d+, d");
		p[7] = Pattern.compile("Điện thoại");
		for(int i = 0; i < 4; i++) {
			Matcher matcher = p[i].matcher(line);
			while(matcher.find()) {
				arr[i] = line.substring(matcher.start(), matcher.end());
			}
		}
	}

	@Override
	public void convert() {
		if(arr[0] != null)
			converter[0] = arr[0].substring(10, arr[0].length() - 1);
		if(arr[1] != null)
			converter[1] = arr[1].substring(4, arr[1].length() - 1);
		if(arr[2] != null)
			converter[2] = arr[2].substring(6, arr[2].length() - 1);
		if(arr[3] != null)
			converter[3] = arr[3].substring(6, arr[3].length() - 1);
		if(arr[4] != null)
			converter[4] = arr[4];
		if(arr[5] != null)
			converter[5] = arr[5].substring(4, arr[5].length());
		if(arr[6] != null)
			converter[6] = arr[6].substring(0, arr[6].length() - 3);
		if(arr[7] != null)
			converter[7] = arr[7];
	}

	public String[] getArrConveter() {
		return converter;
	}
}
