package br.indie.fiscal4j.nfe400.transformers;

import br.indie.fiscal4j.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicao;
import org.simpleframework.xml.transform.Transform;

public class NFNotaInfoItemProdutoVeiculoCondicaoTransformer implements Transform<NFNotaInfoItemProdutoVeiculoCondicao> {

    @Override
    public NFNotaInfoItemProdutoVeiculoCondicao read(final String codigo) {
        return NFNotaInfoItemProdutoVeiculoCondicao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemProdutoVeiculoCondicao tipo) {
        return tipo.getCodigo();
    }
}