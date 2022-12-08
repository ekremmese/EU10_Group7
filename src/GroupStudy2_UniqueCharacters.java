public class GroupStudy2_UniqueCharacters {
    /*Please find the unique characters in the given String by using as many as different methods*/

    public static void main(String[] args) {
        uniqueCharacters1("xxxxxxabnğğğğğ");
        System.out.println(uniqueCharacters2("poıuytrewdfghjkl"));
    }

    public static void uniqueCharacters1(String str) {

        String result = ""; //"b"
        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (starting from 0)
            char ch = str.charAt(i); //ch: each characters of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of the character are same, then the character is unique
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static boolean uniqueCharacters2(String str) {
        boolean isUniqueCharacters=true;
        for (Character each : str.toCharArray()) {
            int count = 0;
            for (Character temp : str.toCharArray()) {
                if (each == temp)
                    count++;
            }
            if(count>1)
                isUniqueCharacters= false;
        }
        return isUniqueCharacters;
    }

    public static void uniqueCharacters3(String str) {

    }

}
