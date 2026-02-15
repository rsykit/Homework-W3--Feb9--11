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
    
    //Build a max-heap from an array of WordFreq objects
    public static void buildMaxHeap(WordFreq[] arr) {
        int n = arr.length; //initialize n as the number of elements in the array
        // Start from the last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);  
        }
    }

    // Heapify a subtree rooted with node i which is an index in arr[].
    public static void maxHeapify(WordFreq[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child index
        int right = 2 * i + 2; // right child index
        // If left child is larger than root
        if (left < n && arr[left].frequency > arr[largest].frequency) {
            largest = left; //largest is left child
        }
        // If right child is larger than largest so far        
        if (right < n && arr[right].frequency > arr[largest].frequency) {
            largest = right; //largest is right child
        }
        // If largest is not root, swap with largest and continue heapifying
        if (largest != i) {
            WordFreq temp = arr[i]; //store the root in a temporary WordFreq variable
            arr[i] = arr[largest]; //update the rooth with the largest
            arr[largest] = temp; //update the largest with the temp
            maxHeapify(arr, n, largest); //recursion
        }
    }
}
