public class ArrayList {
    int size;
    int datum[];
    // Practice
    public ArrayList() {
        size = 0;
        datum = new int[2];
    }

    public int size() {
        return size;
    }


    public void add(int data) {
        if(isFull()) {
            int[] newDatum = new int[datum.length * 2];

            for (int i = 0; i < datum.length; i++) {
                newDatum[i] = datum[i];
            }
            datum = newDatum;
        }

        datum[size] = data;
        size++;
    }

    public int get(int index) {
        return datum[index];
    }


    public void removeAt(int index) {
        for(int i = index + 1; i < datum.length; i++) {
            datum[i-1] = datum[i];
        }
        size--;
    }


    public int getArrayLength() {
        return datum.length;
    }

    private boolean isFull() {
        return size == datum.length;
    }

    public void addAt(int index, int data) {
        for(int i = index; i < size; i++) {
            datum[i + 1] = datum[i];
        }
        datum[index] = data;
        size++;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i < size; i++) {
            System.out.printf("%d : %d", i, datum[i]);
        }
    }
}

//    // Test
//    private int size;
//    private int[] datum;
//
//    public ArrayList() {
//        size = 0;
//        datum = new int[2];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void add(int data) {
//        sizeUpFull();
//
//        datum[size] = data; // 맨 첫번째는 0 , 1씩 증가
//        size++;
//    }
//
//    private void sizeUpFull() {
//        if(isFull()) {
//            sizeUp();
//        }
//    }
//
//    private void sizeUp() {
//        int[] newDatum = new int[datum.length * 2];
//
//        for(int i = 0; i < datum.length; i++) {
//            newDatum[i] = datum[i];
//        }
//
//        datum = newDatum;
//    }
//
//    private boolean isFull() {
//        return size == datum.length;
//    }
//
//    public int get(int index) {
//        return datum[index];
//    }
//
//    public void removeAt(int index) {
//        for(int i = index + 1; i < size; i++) {
//            datum[i-1] = datum[i];
//        }
//        size--;
//    }
//
//    public int getArrayLength() {
//        return datum.length;
//    }
//
//
//    public void showAllValues() {
//        System.out.println("== 전체 데이터 출력 ==");
//        for (int i = 0; i < size; i++) { // 저장된 데이터의 수만큼 출력하기 위해 size사용
//            System.out.printf("%d : %d\n", i, datum[i]);
//        }
//    }
//}
