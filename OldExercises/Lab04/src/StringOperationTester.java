public class StringOperationTester {
    static void stringOperations(String str){
        // Oryginalny tekst: Przykładowy tekst
        // Długość tekstu: 17
        // Tekst wielkimi literami: PRZYKŁADOWY TEKST
        // Tekst małymi literami: przykładowy tekst
        // Indeks pierwszego 'a': 6
        // Podciąg od 5 do 10: ładow
        // Czy zaczyna się od 'Przyk': true
        // Podzielono na 2 słowa:
        // - Przykładowy
        // - tekst

        System.out.println("Oryginalny tekst: "+str);
        System.out.println("Długość tekstu: "+str.length());
        System.out.println("Tekst wielkimi literami: "+str.toUpperCase());
        System.out.println("Tekst małymi literami: "+str.toLowerCase());
        System.out.println("Indeks pierwszego 'a': "+str.indexOf('a'));
        System.out.println("Podciąg od 5 do 10: "+str.substring(5,10));
        System.out.println("Czy zaczyna się od 'Przyk': "+str.startsWith("Przyk"));
        System.out.println("Podzielono na 2 słowa:");
        String[] l=str.split(" ");
        for (String string : l) {
            System.out.println("- "+string);
        }
    }
}
