package dao;

import java.util.List;

import dominio.Produto;

public class DaoProduto {
	
	public void salvar(Produto produto) {
		System.out.println("salvando produto");
	}
	
	public void excluir(Produto produto) {
		System.out.println("excluindo produto");
	}
	
	public List<Produto> listar(String nome){
		System.out.println("listando produtos");
		return null;
	}

}
