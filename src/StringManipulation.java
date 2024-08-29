public class StringManipulation {
    public static void main(String[] args) {
        final String originalPhrase = "      Esta es mi primer tarea y voy a sacar un diecesote                                 ";

        String phrase1 = originalPhrase.trim();
        String phrase2 = phrase1.substring(0, 26) + phrase1.substring(26).toUpperCase();
        String phrase3 = phrase1.replaceAll(" ", "").toLowerCase();
        String phrase4 = phrase1.replaceAll("[eE]", "a").toLowerCase();
        String phrase5 = phrase1.replaceAll("[^aeiouAEIOU\s]", "");
        String phrase6 = phrase1.replaceAll("[aeiouAEIOU]", "");
        String phrase7 = phrase1.replaceAll("[aeiouAEIOU]", "I");
        String phrase8 = phrase1 + " y me voy a ganar una ESTRELLITA en la frente";
        String phrase9 = phrase1.substring(8, 30);
        String phrase10 = phrase1.replaceAll("[^a-zA-Z]", " ");

        System.out.println("phrase1: " + phrase1);
        System.out.println("phrase2: " + phrase2);
        System.out.println("phrase3: " + phrase3);
        System.out.println("phrase4: " + phrase4);
        System.out.println("phrase5: " + phrase5);
        System.out.println("phrase6: " + phrase6);
        System.out.println("phrase7: " + phrase7);
        System.out.println("phrase8: " + phrase8);
        System.out.println("phrase9: " + phrase9);
        System.out.println("phrase10: " + phrase10);
    }
}