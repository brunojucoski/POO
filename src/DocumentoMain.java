import javax.swing.*;
import java.time.LocalDate;

public class DocumentoMain {
    public static void main(String[] args) {

        documento doc1 = new documento();
        doc1.nome = "Jonas";
        documento doc2 = doc1;
        doc2.nome = "Maria Eduarda";

        System.out.println(doc1);
        System.out.println(doc2);

    }
}
