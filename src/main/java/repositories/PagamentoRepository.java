package repositories;

import java.util.ArrayList;
import java.util.List;

public class PagamentoRepository {
    private List<PagamentoRepository> pagamento = new ArrayList<>();

    public  List<PagamentoRepository> buscarTodos() {return  pagamento;}

}
