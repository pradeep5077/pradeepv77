public class testsr {
    public static void main(String[] args) {
        String w="java";
        char[]word=w.toCharArray();
        char[]duplicateword=w.toCharArray();
        int c=0;
        char a=' ';
        for(int i=0;i<word.length;i++)
        {
            for(int j=0;j<word.length;j++)
            {
                if(word[i]==duplicateword[j])
                {
                    duplicateword[j]=a;
                    c++;
                }

            }
            if(c>0) {
                System.out.println(word[i]+ " = " + c );
            }
            c=0;
        }
    }
}
