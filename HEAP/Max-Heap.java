class Max_Heap {
    int[] arr;
    int heapsize, maxsize;

    Max_Heap(int ms) {
        maxsize = ms;
        heapsize = 0;
        arr = new int[maxsize];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int Lchild(int i) {
        return (2 * i) + 1;
    }

    int Rchild(int i) {
        return (2 * i) + 2;
    }

    void insert_data(int x) {
        if (heapsize == maxsize) {
            System.out.println("Heap overflow");
            return;
        }
        int i = heapsize;
        arr[i] = x;
        heapsize++;
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    int get_max() {
        return arr[0];
    }

    int curr_size() {
        return heapsize;
    }

    void Delete_Max() {
        if (heapsize <= 0) 
            System.out.println("Heap underflow");
        else if (heapsize == 1) {
            heapsize--;
        } else {
            arr[0] = arr[heapsize - 1];
            heapsize--;
            Heapify(0);
        }
    }

    void Heapify(int i) {
        int l = Lchild(i);
        int r = Rchild(i);
        int largest = i;
        if (l < heapsize && arr[l] > arr[largest]) largest = l;
        if (r < heapsize && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Heapify(largest);
        }
    }

    public static void main(String[] args) {
        Max_Heap heap = new Max_Heap(10);

        heap.insert_data(50);
        heap.insert_data(30);
        heap.insert_data(20);
        heap.insert_data(15);
        heap.insert_data(10);
        heap.insert_data(8);
        heap.insert_data(25);

        System.out.println("Max value: " + heap.get_max());
        System.out.println("Heap size: " + heap.curr_size());

        heap.Delete_Max();
        System.out.println("After deleting max, new max value: " + heap.get_max());
        System.out.println("Heap size after delete: " + heap.curr_size());
    }
}
