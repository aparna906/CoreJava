package Assignment1;

import org.jsoup.Jsoup;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    //count repeated words
    private static void countWord(String webpage) {
        File file = new File("word.txt");
        String[] words = webpage.split(" ");
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++)
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            if (words[i] != "0") System.out.println(words[i] + "  " + count);
            count++;
        }

        //write content into word.txt file
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String str : words) {
                bufferedWriter.write(str + System.lineSeparator());
            }
        } catch (IOException ioException) {
            ioException.getMessage();
        }

    }

    //read url from url.txt file
    public static void readUrl() {
        File file = new File("url.text");
        try (FileReader fileReader = new FileReader(file); BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String webpage = getUrl(line);
                countWord(webpage);
                System.out.println(webpage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getUrl(String url) throws IOException {
        String content = "";
        URL url1 = new URL(url);
        URLConnection urlConnection = url1.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            content = content + line;
        }

        //Parsing HTML to text using Jsoup dependency.
        content = Jsoup.parse(content).body().text();
        content = content.toLowerCase();
        return content;
    }

    public static void main(String[] args) {
        readUrl();
    }
}