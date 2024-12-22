public class array01 {
    public static int strSearch (String str, char target) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        char target = '1';
        if (strSearch("jaskaran",target)==1) {
            System.out.println("Found");
            return;
        }
        System.out.println("Not Found");
            
    }
}