package  FileHadeling;

import java.io.*;
import java.net.*;
import  java.util.*;

public class wordCount {
    public static void main(String[] args) throws IOException {
        File myObj = new File("C:\\Users\\User\\Desktop\\R.S\\Day !\\R.S.txt");

        //write to a file

        /*String ContentsToWrite = "Hello Prithibi !";
        OutputStream os = new FileOutputStream(myObj);
        os.write(ContentsToWrite.getBytes());
        System.out.println("Content is written already");*/

        //Read from a file

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(myObj)));
        String f = reader.readLine();
        reader.close();
        System.out.println(f);*/

        //Open a url from a browser
        URL url =new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
        InputStream stream = url.openStream();

        //Read all the data in LINK

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line = reader.readLine();
        while (line != null){
            System.out.println(line);
            line = reader.readLine();
        }
        System.out.println("Done Reading");*/
        // ... counting all the words as we go!
        Scanner scanner = new Scanner(stream);
        // upper- and lowercase letters form words
        // everything else is the delimiter between words
        // this uses *regular expressions*, Google them for more info if interested
        scanner.useDelimiter("[^a-zA-Z]+");
        final Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        while (scanner.hasNext())
        {
            // convert to lowercase so that we don't double count (eg "the" vs "The")
            String word = scanner.next().toLowerCase();
            if (!wordCounts.containsKey(word))
            {
                wordCounts.put(word, 1);
            } else
            {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }
        scanner.close();

        // get a list of all *distinct* words
        String[] words = wordCounts.keySet().toArray(new String[0]);

        // sort it by number of occurrences
        Arrays.sort(words, new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                // negative to sort by descending order!
                return -Integer.compare(wordCounts.get(a), wordCounts.get(b));
            }
        });

        // show the most common words
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Top words do you want to count ?");
        int n = sc.nextInt();
        System.out.println("Top " + n + " Words");
        for (int i = 0; i < n; i++)
        {
            System.out.println((i + 1) + ": " + words[i] + " with "
                    + wordCounts.get(words[i]) + " occurrences");
        }
        System.out.println("Done!");
    }
}
