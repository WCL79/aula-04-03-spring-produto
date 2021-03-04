package br.com.zup.produto.services;

import br.com.zup.produto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static List<Produto> produtos = new ArrayList<>();

        public void adicionarProduto(Produto produto){
            produtos.add(produto);
        }

        public List<Produto> pegarProdutos(){
            return produtos;
        }

    }
