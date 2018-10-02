package heap;

import java.util.*;

class MinHeap
{
	private int[] Heap;
    private int size;
    private int maxsize;

    public MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
        // Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos)
    {
        return (pos-1) / 2;
    }
 
    private int left(int pos)
    {
        return (2 * pos + 1);
    }
 
    private int right(int pos)
    {
        return (2 * pos) + 2;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Inserts a new key 'k'
	public void insertKey(int k)
	{
	    if (size == maxsize)
	    {
	        System.out.println("Overflow: Could not insertKey");
	        return;
	    }
	 
	    // First insert the new key at the end
	    size++;
	    int i = size - 1;
	    Heap[i] = k;
	 
	    // Fix the min heap property if it is violated
	    while (i != 0 && Heap[parent(i)] > Heap[i])
	    {
	       swap(i, parent(i));
	       i = parent(i);
	    }
	}

	// Decreases value of key at index 'i' to new_val.  It is assumed that
	// new_val is smaller than harr[i].
	public void decreaseKey(int i, int new_val)
	{
	    Heap[i] = new_val;
	    while (i != 0 && Heap[parent(i)] > Heap[i])
	    {
	       swap(i, parent(i));
	       i = parent(i);
	    }
	}

	public int extractMin()
	{
	    if (size <= 0)
	        return Integer.MAX_VALUE;
	    if (size == 1)
	    {
	        size--;
	        return Heap[0];
	    }
	 
	    // Store the minimum value, and remove it from heap
	    int root = Heap[0];
	    Heap[0] = Heap[size-1];
	    size--;
	    MinHeapify(0);
	 
	    return root;
	}

	// This function deletes key at index i. It first reduced value to minus
	// infinite, then calls extractMin()
	public void deleteKey(int i)
	{
	    decreaseKey(i, Integer.MIN_VALUE);
	    extractMin();
	}

	// A recursive method to heapify a subtree with the root at given index
	// This method assumes that the subtrees are already heapified
	public void MinHeapify(int i)
	{
	    int l = left(i);
	    int r = right(i);
	    int smallest = i;
	    if (l < size && Heap[l] < Heap[i])
	        smallest = l;
	    if (r < size && Heap[r] < Heap[smallest])
	        smallest = r;
	    if (smallest != i)
	    {
	        swap(i, smallest);
	        MinHeapify(smallest);
	    }
	}

	public void print()
    {
        for (int i = 0; i < size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i + 1] 
                + " RIGHT CHILD :" + Heap[2 * i  + 2]);
            System.out.println();
        } 
    }

	public static void main(String[] arg)
    {
        System.out.println("The Min Heap is ");
        MinHeap minHeap = new MinHeap(15);
        minHeap.insertKey(5);
        minHeap.insertKey(3);
        minHeap.insertKey(17);
        minHeap.insertKey(10);
        minHeap.insertKey(84);
        minHeap.insertKey(19);
        minHeap.insertKey(6);
        minHeap.insertKey(22);
        minHeap.insertKey(9);
 
        minHeap.print();
        System.out.println("The Min val is " + minHeap.extractMin());
    }
}