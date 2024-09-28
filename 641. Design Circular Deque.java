class MyCircularDeque {
    int arr[];
    int front,end,size,cap;

    public MyCircularDeque(int k) {
        arr = new int[k];
        front = 0;
        end = 0;
        size = 0;
        cap = k; 
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;

        if(front == 0) {
            front = cap-1;
        }
        else {
            front--;
        }

        arr[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;

        arr[end] = value;

        if(end == cap-1) {
            end = 0;
        }
        else {
            end++;
        }

        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;

        arr[front] = -1;

        if(front == cap-1) {
            front = 0;
        }
        else {
            front++;
        }

        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;

        if(end == 0) {
            end = cap-1;
        }
        else {
            end--;
        }

        size--;
        arr[end] = -1;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;

        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;

        if(end == 0) {
            return arr[cap-1];
        }
        else {
            return arr[end-1];
        }
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
