package br.com.sud.converter;

import br.com.sud.modelo.Transportadora;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Valcelio
 */
@FacesConverter(value = "conversorTransportadora",forClass = Transportadora.class)
public class converterTransportadora implements Converter{
 
       @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (!value.isEmpty() && value != null) {
            return (Transportadora) component.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Transportadora) {
            Transportadora entity = (Transportadora) value;
            if (entity != null && value instanceof Transportadora && entity.getId() != null) {
                component.getAttributes().put(entity.getId().toString(), entity);
                return entity.getId().toString();
            }
        }
        return "";
    }

}
