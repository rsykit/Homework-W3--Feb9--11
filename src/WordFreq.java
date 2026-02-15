/**
 * Instruction: Please make incremental commits to git so that we can see the version history and your thought process.

You are given a list of commonly used customer‑survey phrases, each paired with the number of times it appeared in recent feedback. Define a class:


class WordFreq {
    String word;
    int frequency;
}

Each WordFreq object stores a phrase and its frequency. The frequency determines the priority of the object in the heap (higher frequency ⇒ higher priority).

Task
Create an array of WordFreq objects using the following data:

Phrase	Frequency
happy	400
satisfied	100
neutral	300
would buy again	200
terrible	160
inconvenient	900
difficult to use	100
easy to use	140
would recommend to friends	800
visit the store	700
Write code to build a max‑heap from this array using the standard BUILD‑MAX‑HEAP procedure (bottom‑up heap construction).

After running your buildMaxHeap function, print the array to show the heapified order.


 */

public class WordFreq {
    String word;
    int frequency;

    // Constructor to initialize the WordFreq object
    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }
    
    

}