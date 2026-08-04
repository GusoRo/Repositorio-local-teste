import static java.lang.IO.readln;
import java.util.ArrayList;
import java.util.Collections;

void main() {

    ArrayList<Double> preco = new ArrayList<Double>();

    for (int i = 0; i < 5; i++) {
        preco.add(Double.parseDouble(readln("Informe o valor do " + (i + 1) + "° item: ")));
    }

    IO.println("=========================================\n"+
            "O menor preço é "+(Collections.min(preco)+"\n")+
            "=========================================");
    IO.println("O maior preço é "+(Collections.max(preco))+"\n"+
            "=========================================");
    IO.println("Lista de preços:"+"\n"+
    (preco));

}
