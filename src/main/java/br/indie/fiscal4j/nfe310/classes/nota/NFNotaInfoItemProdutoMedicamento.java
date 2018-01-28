package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFNotaInfoItemProdutoMedicamento extends DFBase {
    private static final long serialVersionUID = 3127772234811692432L;

    @Element(name = "nLote", required = true)
    private String lote;

    @Element(name = "qLote", required = true)
    private String quantidade;

    @Element(name = "dFab", required = true)
    private LocalDate dataFabricacao;

    @Element(name = "dVal", required = true)
    private LocalDate dataValidade;

    @Element(name = "vPMC", required = true)
    private String precoMaximoConsumidor;

    public NFNotaInfoItemProdutoMedicamento() {
        this.lote = null;
        this.quantidade = null;
        this.dataFabricacao = null;
        this.dataValidade = null;
        this.precoMaximoConsumidor = null;
    }

    public String getLote() {
        return this.lote;
    }

    public void setLote(final String lote) {
        StringValidador.tamanho20(lote, "Lote Medicamento");
        this.lote = lote;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = BigDecimalParser.tamanho11Com3CasasDecimais(quantidade, "Quantidade Medicamento");
    }

    public LocalDate getDataFabricacao() {
        return this.dataFabricacao;
    }

    public void setDataFabricacao(final LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(final LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getPrecoMaximoConsumidor() {
        return this.precoMaximoConsumidor;
    }

    public void setPrecoMaximoConsumidor(final BigDecimal precoMaximoConsumidor) {
        this.precoMaximoConsumidor = BigDecimalParser.tamanho15Com2CasasDecimais(precoMaximoConsumidor, "Preco Maximo Consumidor Medicamento");
    }
}