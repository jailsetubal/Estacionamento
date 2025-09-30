package facades;

import applications.LeituraSensorApplication;
import entities.LeituraSensor;

import java.io.IOException;
import java.util.List;

public class LeituraSensorFacede {
    private LeituraSensorApplication leituraSensorApplication;

    public LeituraSensorFacede(LeituraSensorApplication leituraSensorApplication) {
        this.leituraSensorApplication = leituraSensorApplication;
    }

    public List<LeituraSensor> buscarTodos() throws IOException {
        return this.leituraSensorApplication.buscarTodos();
    }

    public LeituraSensor buscarPorId(LeituraSensor leituraSensor) throws IOException {
        return this.leituraSensorApplication.buscarPorId(leituraSensor);
    }

    public void adicionar(LeituraSensor leituraSensor) throws IOException {
        this.leituraSensorApplication.adicionar(leituraSensor);
    }

    public void remover(LeituraSensor leituraSensor) throws IOException {
        this.leituraSensorApplication.remover(leituraSensor);
    }

    public void atualizar(int id, LeituraSensor leituraSensor) throws IOException {
        this.leituraSensorApplication.atualizar(leituraSensor, leituraSensor.getId());
    }


}

