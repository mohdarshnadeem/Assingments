import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {
    public static void main(String[] args) {
//       if argument length is less then 2 means we will not get our desired output
        if(args.length < 2){
            System.out.println("not enoung arguments");
            return;
        }
        String fileName = args[0];
        String word = args[1];
        int count = 0;
//          using try with resources to auto close
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
//            checking that we reached end of file or not,
//            if not split and add words to arrays of string
            while((line = reader.readLine()) !=null){
//                splitting white spaces
                String[] words = line.split("\\s+");
                for (String w : words){
                    if(w.equals(word)){
                        count++;
                    }
                }
            }
        }catch (IOException e){
            System.out.println("error in reading this file " + e.getMessage());
        }

        System.out.println("Word " +word+" appers "+count+" times");
    }
}
