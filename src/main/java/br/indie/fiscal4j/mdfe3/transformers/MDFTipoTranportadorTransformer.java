package br.indie.fiscal4j.mdfe3.transformers;

import br.indie.fiscal4j.mdfe3.classes.def.MDFTipoTranportador;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 06/11/17.
 */
public class MDFTipoTranportadorTransformer implements Transform<MDFTipoTranportador> {

    @Override
    public MDFTipoTranportador read(String value) throws Exception {
        return MDFTipoTranportador.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoTranportador value) throws Exception {
        return value.getCodigo();
    }
}