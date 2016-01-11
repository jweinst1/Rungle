package rungle;//Turing Machine backbone class

public class TuringMachine {

    public int size;
    public int pointer;
    public int[] cells;

    public TuringMachine(int capacity) {
        size = capacity;
        pointer = 0;
        cells = new int[size];
        for(int i=0;i<cells.length;i++) cells[i] = 0;
    }
    public void pushpointer(int spaces) {
        pointer += spaces;
    }
    public void pullpointer(int spaces) {
        //prevents pointer from going below 0
        if(pointer - spaces < 0) {}
        else pointer -= spaces;
    }
    public void increasecell(int amount) {
        cells[pointer] += amount;
    }
    public void decreasecell(int amount) {
        cells[pointer] -= amount;
    }
    //copies current cell value to next one.
    public void copynext() {
        cells[pointer+1] = cells[pointer];
    }
    public void addtonext() {
        cells[pointer+1] += cells[pointer];
    }
    public void multiplybynext() {
        cells[pointer] = cells[pointer]*cells[pointer+1];
    }
    //sums the total of all cells up to pointer
    public void sumtopointer() {
        int total = 0;
        for(int i=0;i<pointer;i++) {
            if(cells[i]==(int)cells[i]) total += cells[i];
        }
        cells[pointer] = total;
    }

    public void resetpointer() {
        pointer = 0;
    }

    public int getcell() {
        return cells[pointer];
    }
}
