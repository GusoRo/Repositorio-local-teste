import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    //Cria lista de preços
    ArrayList<Double> preco = new ArrayList<Double>();

    //Utiliza do for para adicionar os valores dos produtos um por um
    for (int i = 0; i < 5; i++) {
        preco.add(Double.parseDouble(readln("Informe o valor do " + (i + 1) + "° item: ")));
    }

    //Escaneia a lista e printa o menor e o maior preço na lista
    IO.println("=========================================\n"+
            "O menor preço é "+(Collections.min(preco)+"\n")+
            "=========================================");
    IO.println("O maior preço é "+(Collections.max(preco)));

}