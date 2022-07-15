import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }

    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertEquals(0, al.size());
    }

    @Test
    void add() {
        ArrayList al = new ArrayList();
        al.add(100);
    }

    void get() {
        ArrayList al = new ArrayList();
        al.add(100);
        int rs = al.get(0);

        assertEquals(100, rs);
    }

    @Test
    void add를_한번_할_때_마다_size가_증가() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(3, al.size());
    }
}
