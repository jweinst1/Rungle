package rungle; /**
 * Created by Josh on 1/10/16.
 */
import rungle.TuringMachine;

//class that reads commands and sends them to turing machine
public class Reader {
    public TuringMachine machine;

    public Reader() {
        machine = new TuringMachine(30000);
    }
    public String Interpret(String line) {
        String returned = "";
        char[] tokens = line.toCharArray();
        for(int i=0;i<tokens.length;i++) {
            switch(tokens[i]) {
                case '>': machine.pushpointer(1);
                    break;
                case '<': machine.pullpointer(1);
                    break;
                case '+': machine.increasecell(1);
                    break;
                case '-': machine.decreasecell(1);
                    break;
                case '.': returned += String.valueOf(machine.getcell()) + " ";
                    break;
                case '!': machine.resetpointer();
                    break;
                case ':': machine.copynext();
                    break;
                case '#': machine.addtonext();
                    break;
                case '^': machine.multiplybynext();
                    break;
                case '*': machine.sumtopointer();
                    break;
                default:
                    break;
            }
        }
        return returned;
    }
}
