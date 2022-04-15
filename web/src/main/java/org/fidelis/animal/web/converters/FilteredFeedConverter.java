/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fidelis.animal.web.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.fidelis.animal.ServiceLocator;
import org.fidelis.animal.model.feed.FeedVO;

/**
 *
 * @author user
 */
@FacesConverter("filteredFeedConverter")
public class FilteredFeedConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
           Object returnValue = null;
        try {
            if (value != null && value.trim().length() > 0) {
                try {
                    returnValue = ServiceLocator.instance().getFeedService()
                            .load(Long.valueOf(value));
                } catch (NumberFormatException e) {
                    returnValue = value;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object object) throws ConverterException {
          String returnValue = null;
        try {

            if (object != null) {
                if (object instanceof FeedVO) {
                    returnValue = String.valueOf(((FeedVO) object).getId());
                } else {
                    returnValue = (String) object;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
    
}
