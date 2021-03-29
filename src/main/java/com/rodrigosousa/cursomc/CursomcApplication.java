package com.rodrigosousa.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigosousa.cursomc.domain.Categoria;
import com.rodrigosousa.cursomc.domain.Cidade;
import com.rodrigosousa.cursomc.domain.Cliente;
import com.rodrigosousa.cursomc.domain.Endereco;
import com.rodrigosousa.cursomc.domain.Estado;
import com.rodrigosousa.cursomc.domain.ItemPedido;
import com.rodrigosousa.cursomc.domain.Pagamento;
import com.rodrigosousa.cursomc.domain.PagamentoComBoleto;
import com.rodrigosousa.cursomc.domain.PagamentoComCartao;
import com.rodrigosousa.cursomc.domain.Pedido;
import com.rodrigosousa.cursomc.domain.Produto;
import com.rodrigosousa.cursomc.domain.enums.EstadoPagamento;
import com.rodrigosousa.cursomc.domain.enums.TipoCliente;
import com.rodrigosousa.cursomc.repositories.CategoriaRepository;
import com.rodrigosousa.cursomc.repositories.CidadeRepository;
import com.rodrigosousa.cursomc.repositories.ClienteRepository;
import com.rodrigosousa.cursomc.repositories.EnderecoRepository;
import com.rodrigosousa.cursomc.repositories.EstadoRepository;
import com.rodrigosousa.cursomc.repositories.ItemPedidoRepository;
import com.rodrigosousa.cursomc.repositories.PagamentoRepository;
import com.rodrigosousa.cursomc.repositories.PedidoRepository;
import com.rodrigosousa.cursomc.repositories.ProdutoRepository;
import com.rodrigosousa.cursomc.services.S3Service;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
