import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Leo124124 {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        int wordsSum = 0;

        String line = urlToString("http://erdani.com/tdpl/hamlet.txt");
        line = line.trim();
        long lineLength = line.length();

        for(int i = 0; i < lineLength; i++) {
            if (line.charAt(i) == ' ') {
                wordsSum +=1;
            }
        }

        System.out.println(wordsSum);

        //System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }
}
