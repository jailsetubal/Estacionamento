package applications;

import entities.Movimentacao;
import repositories.MovimentacaoRepository;

import java.io.IOException;
import java.util.List;

public class MovimentacaoApplication {
    private MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoApplication(MovimentacaoRepository movimentacaoRepository){
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public List<Movimentacao> buscarTodos() throws IOException {
        return this.movimentacaoRepository.buscarTodos();
    }

    public Movimentacao buscarPorId(Movimentacao movimentacao) throws IOException{
        return this.movimentacaoRepository.buscarPorId(movimentacao.getId());
    }

    public void adicionar(Movimentacao movimentacao) throws IOException{
        this.movimentacaoRepository.adicionar(movimentacao);
    }

    public void remover(Movimentacao movimentacao) throws IOException{
        this.movimentacaoRepository.remover(movimentacao.getId());
    }

    public void atualizar(Movimentacao movimentacao, int id) throws IOException{
        this.movimentacaoRepository.atualizar(movimentacao.getId(), movimentacao);
    }
}
