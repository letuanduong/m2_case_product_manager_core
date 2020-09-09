package storage;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
	public static void crawlProduct(String source) {
		try {
			URL url = new URL(source);
			Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
			scanner.useDelimiter("\\Z");
			String content = scanner.next();
			scanner.close();
			content.replaceAll("\\n+", "");
			content = content.trim().replaceAll(" +", " ");
			String pattern = "data-brand=\"(.*?)\" data-cat=\"(.*?)\" data-code=\"(.*?)\" data-price=\"(.*?)\" id=\"(.*?)\"";
			Pattern price = Pattern.compile(pattern);
			Matcher mPrice = price.matcher(content);
			
			File productCrawl = new File("E:\\OneDrive\\CodeGym\\Module2\\caseStudy\\ProductCrawl.txt");
			WriteStorage writeStorage = new WriteStorage(productCrawl);

			while (mPrice.find()) {
				writeStorage.save(mPrice.group(1) + ", " + mPrice.group(2) + ", " + mPrice.group(3) + ", "
								+ mPrice.group(4) + ", " + mPrice.group(5));
			}
			writeStorage.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void crawl() {
		final String URL_SAMSUNG = "https://www.thegioididong.com/dtdd-samsung";
		final String URL_IPHONE = "https://www.thegioididong.com/dtdd-apple-iphone";
		crawlProduct(URL_IPHONE);
		crawlProduct(URL_SAMSUNG);
	}
}
