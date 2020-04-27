import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Cipher cipher = new Cipher();

        String input = "";
        while(!input.equals("exit"))
        {
            System.out.print("Enter word: ");
            input = reader.nextLine();
            System.out.print("Encode or decode? ");
            String choice = reader.nextLine();

            String[] words = input.split("\\s+");
            String[] encodedSentence = new String[words.length];

            if(choice.equals("encode"))
            {
                for(int i = 0; i < words.length; ++i)
                    encodedSentence[i] = cipher.encode(words[i]);
            }
            if(choice.equals("decode"))
            {
                for(int i = 0; i < words.length; ++i)
                    encodedSentence[i] = cipher.decode( words[i]);
            }

            if(encodedSentence.length > 1)
            {
                StringBuilder sentence = new StringBuilder();
                for(String word : encodedSentence)
                    sentence.append(word + " ");

                System.out.println(sentence.toString());
            }
            else
                System.out.println(encodedSentence[0]);
        }
    }
}