public class SortedIntList extends IntList {

    public SortedIntList(int size) {
        super(size);
    }

    @Override
    public void add(int value) {
        if (numElements == list.length) {
            System.out.println("Can't add, list is full");
        }
        else {
            int i;
            for (i = 0; (i < numElements) && (value >= list[i]); i++) {
            }

            for (int j = numElements - 1; j >= i; j--) {
                list[j + 1] = list[j];
            }
            list[i] = value;
            numElements++;
        }
    }
}