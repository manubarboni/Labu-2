package Pachet;

import java.util.Random;

public class Vers {
    private String vers;
    Vers(String linie)
    {
        this.vers=linie;
    }
    String getVers()
    {
        return this.vers;
    }
    void countWords()
    {
        String[] s = this.vers.split(" ");
        this.vers = vers.concat(" " + String.valueOf(s.length));
    }
    void addStar()
    {
        if(vers.endsWith("me"))
        {
            this.vers = vers.concat("*");
        }
    }
    void toUpp()
    {
        Random random = new Random();
        if(random.nextFloat(1)<0.1)
        {
            this.vers = vers.toUpperCase();
        }
    }
    int vowelNumber()
    {
        char[] chars = vers.toCharArray();
        char[] vowels = {'a','e','i','o','u'};
        int count = 0;
        for(int i=0;i<vowels.length;i++)
         for(int j=0;j<chars.length;j++)
         {
             if(chars[i]==vowels[i])
             {
                 count++;
             }
         }
        return count;
    }
}
