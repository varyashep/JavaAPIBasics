public class Seminar2 {
    public static void main(String[] args){
        String firstString = "Основание -4, степень 3, результат ";
        String newString = GetResult(firstString);
        System.out.println(newString);
        
    }

    public static String GetResult(String userString) {
 
        StringBuilder digits = new StringBuilder();
        int base = 0;
        int deg = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (Character.isDigit(userString.charAt(i)) || userString.charAt(i) == ',' || userString.charAt(i) == '-') {
                digits.append(userString.charAt(i));
            }
        }
        String[] finalString = (digits.toString()).split(",");

        try {
            base = Integer.parseInt(finalString[0]);
        } catch (Exception e) {}
        try {
            deg = Integer.parseInt(finalString[1]);
        } catch (Exception e) {}

        return userString + " " + Double.toString(Math.pow(base,deg));
    }
}
