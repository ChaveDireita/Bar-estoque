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
import barestoque.view.telas.compra.TelaCompra;
import barestoque.view.telas.fornecedor.TelaFornecedor;
import barestoque.view.telas.produto.TelaProduto;
import barestoque.view.telas.venda.TelaVenda;
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
            eventoBotoesCardapio((TelaCardapioBotoesMenu) contexto, e);
        else if (contexto instanceof TelaTransacao)
            eventoTelaTransacao((TelaTransacao) contexto, e);
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
    
    private void eventoBotoesCardapio (TelaCardapioBotoesMenu cardapioMenu, ActionEvent e)
    {
        Object src = e.getSource();
        if (src == cardapioMenu.getBotaoCadastrar())
            pai.setCena(new TelaCardapioCadastro(pai));
        else if (src == cardapioMenu.getBotaoListar())
            pai.setCena(new TelaCardapioLista(pai));
        else if (src == cardapioMenu.getBotaoVoltar())
            pai.setCena(new TelaMenu(pai));
    }
    
}
