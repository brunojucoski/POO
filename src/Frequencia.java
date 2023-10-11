import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Frequencia {

        Boolean presenca ;
        LocalDate dataAula;

        @Override
        public String toString() {
                return "Frequencia{" +
                        "presenca=" + presenca +
                        ", dataAula=" + dataAula +
                        '}';
        }

        public Boolean getPresenca() {
                return presenca;
        }

        public void setPresenca(Boolean presenca) {
                this.presenca = presenca;
        }

        public LocalDate getDataAula() {
                return dataAula;
        }

        public void setDataAula(LocalDate dataAula) {
                this.dataAula = dataAula;
        }
}











