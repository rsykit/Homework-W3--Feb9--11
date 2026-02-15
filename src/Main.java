public class Main {

    // Main method to test the buildMaxHeap function
    public static void main(String[] args) {
        WordFreq[] wordFreqs = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };
        WordFreq.buildMaxHeap(wordFreqs); //build the max-heap from the array of WordFreq objects
        // Print the heapified order        
        System.out.println("Heapified order:");
        for (WordFreq wf : wordFreqs) {
            System.out.println(wf.word + ": " + wf.frequency);
        }
    }

}
