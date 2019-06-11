package barestoque.controller;

import barestoque.view.Janela;
import barestoque.view.componentes.SetBotoesApenasSair;
import barestoque.view.telas.Tela;
import barestoque.view.telas.TelaInicial;
import barestoque.view.telas.TelaMenu;
import barestoque.view.telas.TelaTransacao;
import barestoque.view.telas.cardapio.TelaCardapio;
import barestoque.view.telas.cardapio.TelaCardapioBotoesMenu;
import barestoque.view.telas.cardapio.TelaCardapioCadastro;
import barestoque.view.telas.cardapio.TelaCardapioLista;
import barestoque.view.telas.cliente.TelaCliente;
import barestoque.view.telas.cliente.TelaClienteBotoesMenu;
import barestoque.view.telas.cliente.TelaClienteCadastro;
import barestoque.view.telas.cliente.TelaClienteLista;
import barestoque.view.telas.compra.TelaCompra;
import barestoque.view.telas.compra.TelaCompraBotoesMenu;
import barestoque.view.telas.compra.TelaCompraCadastro;
import barestoque.view.telas.compra.TelaCompraLista;
import barestoque.view.telas.fornecedor.TelaFornecedor;
import barestoque.view.telas.fornecedor.TelaFornecedorBotoesMenu;
import barestoque.view.telas.fornecedor.TelaFornecedorCadastro;
import barestoque.view.telas.fornecedor.TelaFornecedorLista;
import barestoque.view.telas.produto.TelaProduto;
import barestoque.view.telas.produto.TelaProdutoBotoesMenu;
import barestoque.view.telas.produto.TelaProdutoCadastro;
import barestoque.view.telas.produto.TelaProdutoLista;
import barestoque.view.telas.venda.TelaVenda;
import barestoque.view.telas.venda.TelaVendaBotoesMenu;
import barestoque.view.telas.venda.TelaVendaCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDeTransicao implements ActionListener
{
    private Janela pai;
    private Tela contexto;
    
    public ControladorDeTransicao(Janela pai, Tela contexto) 
    {
        this.pai = pai;
        this.contexto = contexto;
    }
       
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (contexto instanceof TelaInicial)
            eventoTelaInicial((TelaInicial) contexto, e);
        else if (contexto instanceof TelaMenu)
            eventoTelaMenu((TelaMenu) contexto, e);
        else if (contexto instanceof SetBotoesApenasSair)
            eventoBotoesApenasSair((SetBotoesApenasSair) contexto, e);
        else if (contexto instanceof TelaCardapioBotoesMenu)
            eventoTelaCardapio((TelaCardapioBotoesMenu) contexto, e);
        else if (contexto instanceof TelaTransacao)
            eventoTelaTransacao((TelaTransacao) contexto, e);
         else if (contexto instanceof TelaClienteBotoesMenu)
            eventoTelaCliente((TelaClienteBotoesMenu) contexto, e);
        else if (contexto instanceof TelaCompraBotoesMenu)
            eventoTelaCompra((TelaCompraBotoesMenu) contexto, e);
        else if (contexto instanceof TelaFornecedorBotoesMenu)
            eventoTelaFornecedor((TelaFornecedorBotoesMenu) contexto, e);
        else if (contexto instanceof TelaProdutoBotoesMenu)
            eventoTelaProduto((TelaProdutoBotoesMenu) contexto, e);
        else if (contexto instanceof TelaVendaBotoesMenu)
            eventoTelaVenda((TelaVendaBotoesMenu) contexto, e);
    }
    
    private void eventoTelaInicial (TelaInicial tInicial, ActionEvent e)
    {
        Object src = e.getSource();
        if (src == tInicial.getBotaoSair())
            pai.dispose();
        else if (src == tInicial.getBotaoIniciar())
            pai.setCena(new TelaMenu(pai));
    }
    
    private void eventoTelaMenu (TelaMenu tMenu, ActionEvent e)
    {
        Object src = e.getSource();
        if (src == tMenu.getBotaoMenuCliente())
            pai.setCena(new TelaCliente(pai));
        else if (src == tMenu.getBotaoMenuFornecedor())
            pai.setCena(new TelaFornecedor(pai));
        else if (src == tMenu.getBotaoMenuPrato())
            pai.setCena(new TelaCardapio(pai));
        else if (src == tMenu.getBotaoMenuProduto())
            pai.setCena(new TelaProduto(pai));
        else if (src == tMenu.getBotaoMenuTransacao())
            pai.setCena(new TelaTransacao(pai));
        else if (src == tMenu.getBotaoVoltar())
            pai.setCena(new TelaInicial(pai));
        else if (src == tMenu.getBotaoSair())
            pai.dispose();
    }
    
    private void eventoBotoesApenasSair (SetBotoesApenasSair setApenasSair, ActionEvent e)
    {
        Object src = e.getSource();
        if (src == setApenasSair.getBotaoSair())
            pai.dispose();
    }
    
    private void eventoTelaTransacao (TelaTransacao tTransacao, ActionEvent e)
    {
        Object src = e.getSource();
        if (src == tTransacao.getBotaoSair())
            pai.dispose();
        else if (src == tTransacao.getBotaoVoltar())
            pai.setCena(new TelaMenu(pai));
        else if (src == tTransacao.getBotaoComprar())
            pai.setCena(new TelaCompra(pai));
        else if (src == tTransacao.getBotaoVender())
            pai.setCena(new TelaVenda(pai));
    }
    
    private void eventoTelaCardapio (TelaCardapioBotoesMenu cardapioMenu, ActionEvent e)
    {
        Object src = e.getSource();
        if (src == cardapioMenu.getBotaoCadastrar())
            pai.setCena(new TelaCardapioCadastro(pai));
        else if (src == cardapioMenu.getBotaoListar())
            pai.setCena(new TelaCardapioLista(pai));
        else if (src == cardapioMenu.getBotaoVoltar())
            pai.setCena(new TelaMenu(pai));
    }
    
    private void eventoTelaFornecedor (TelaFornecedorBotoesMenu tFornece, ActionEvent e){
        Object src = e.getSource();
        if (src == tFornece.getBotaoCadastrar()){
            pai.setCena(new TelaFornecedorCadastro(pai));
        }else if (src == tFornece.getBotaoListar()){
            pai.setCena(new TelaFornecedorLista(pai));
        }else if (src == tFornece.getBotaoVoltar()){
            pai.setCena(new TelaMenu(pai));
        }
    }
    
    private void eventoTelaCliente (TelaClienteBotoesMenu tCliente, ActionEvent e){
        Object src = e.getSource();
        if (src == tCliente.getBotaoCadastrar()){
            pai.setCena(new TelaClienteCadastro(pai));
        }else if (src == tCliente.getBotaoListar()){
            pai.setCena(new TelaClienteLista(pai));
        }else if (src == tCliente.getBotaoVoltar()){
            pai.setCena(new TelaMenu(pai));
        }
    }
    
    private void eventoTelaCompra (TelaCompraBotoesMenu tCompra, ActionEvent e){
        Object src = e.getSource();
        if (src == tCompra.getBotaoCadastrar()){
            pai.setCena(new TelaCompraCadastro(pai));
        }else if (src == tCompra.getBotaoListar()){
            pai.setCena(new TelaCompraLista(pai));
        }else if (src == tCompra.getBotaoVoltar()){
            pai.setCena(new TelaTransacao(pai));
        }
    }
    
    private void eventoTelaVenda (TelaVendaBotoesMenu tVenda, ActionEvent e){
        Object src = e.getSource();
        if (src == tVenda.getBotaoCadastrar()){
            pai.setCena(new TelaVendaCadastro(pai));
        }else if (src == tVenda.getBotaoListar()){
            //pai.setCena(new TelaVendaLista(pai));
        }else if (src == tVenda.getBotaoVoltar()){
            pai.setCena(new TelaTransacao(pai));
        }
    }
    
    private void eventoTelaProduto (TelaProdutoBotoesMenu tProduto, ActionEvent e){
        Object src = e.getSource();
        if (src == tProduto.getBotaoCadastrar()){
            pai.setCena(new TelaProdutoCadastro(pai));
        }else if (src == tProduto.getBotaoListar()){
            pai.setCena(new TelaProdutoLista(pai));
        }else if (src == tProduto.getBotaoVoltar()){
            pai.setCena(new TelaMenu(pai));
        }
    }
}
