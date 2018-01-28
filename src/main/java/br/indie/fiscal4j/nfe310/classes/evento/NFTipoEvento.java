package br.indie.fiscal4j.nfe310.classes.evento;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(strict = false)
public class NFTipoEvento extends DFBase {
    private static final long serialVersionUID = 172979194017130488L;

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "descEvento", required = true)
    private String descricaoEvento;

    // Carta correcao
    @Element(name = "xCorrecao", required = false)
    private String textoCorrecao;

    @Element(name = "xCondUso", required = false)
    private String condicaoUso;

    public String getDescricaoEvento() {
        return this.descricaoEvento;
    }

    public void setDescricaoEvento(final String descricaoEvento) {
        StringValidador.tamanho5a60(descricaoEvento, "Descricao do Evento");
        this.descricaoEvento = descricaoEvento;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho5Com2CasasDecimais(versao, "Versao");
    }

    public String getCondicaoUso() {
        return this.condicaoUso;
    }

    public void setCondicaoUso(final String condicaoUso) {
        this.condicaoUso = condicaoUso;
    }

    public String getTextoCorrecao() {
        return this.textoCorrecao;
    }

    public void setTextoCorrecao(final String textoCorrecao) {
        this.textoCorrecao = textoCorrecao;
    }
}