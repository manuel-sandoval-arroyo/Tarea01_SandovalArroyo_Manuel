public class Assignment1 {
    public static void main(String[] args) {
        final String originalPhrase = "- 6 - Esta es mi primer tarea y voy a sacar un diecesote- 33 -";
        final String originalString = "   Esta es mi primera tarea y voy a sacar un diecesote";

        String phrase1 = phrase1(originalPhrase);
        String phrase2 = phrase2(phrase1);
        String phrase3 = phrase3(phrase1);
        String phrase4 = phrase4(phrase1);
        String phrase5 = phrase5(phrase1);
        String phrase6 = phrase6(phrase1);
        String phrase7 = phrase7(phrase1);
        String phrase8 = phrase8(phrase1);
        String phrase9 = phrase9(phrase1);
        String phrase10 = phrase10(phrase1);

    }

    static String phrase1(String originalPhrase) {
        return originalPhrase.trim();
    }

    static String phrase2(String originalPhrase) {
        return originalPhrase.substring(0, 26).trim() + originalPhrase.substring(26 + 1).toUpperCase();
    }

    static String phrase3(String originalString) {
        return originalString.replaceAll(" ", "").toLowerCase();
    }

    static String phrase4(String originalString) {
        return originalString.replaceAll("e", "a").toUpperCase();
    }

    static String phrase5(String originalString) {
        return originalString.replaceAll("[^aeiouAEIOU]", "");
    }

    static String phrase6(String originalString) {
        return originalString.replaceAll("[aeiouAEIOU]", "-");
    }

    static String phrase7(String originalString) {
        return originalString.replaceAll("[aeiouAEIOU]", "I");
    }

    static String phrase8(String originalString) {
        return originalString + " y me voy a ganar una ESTRELLITA en la frente";
    }

    static String phrase9(String originalString) {
        return originalString.replaceAll("[^a-zA-Z]", "-");
    }

    static String phrase10(String originalString) {
        return originalString.replaceAll("[^a-zA-Z]", " ");
    }
}