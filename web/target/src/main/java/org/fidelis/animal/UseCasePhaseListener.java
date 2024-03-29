// license-header java merge-point
// Generated by andromda-jsf cartridge (utils\UseCasePhaseListener.java.vsl) DO NOT EDIT!
package org.fidelis.animal;

import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class UseCasePhaseListener implements PhaseListener {

    private static final long serialVersionUID = 1879387492374102L;

    @Override
    public void beforePhase(PhaseEvent event) {
        if(event.getPhaseId().equals(PhaseId.RESTORE_VIEW))
        {
            //Sometimes the useCaseScope is in the Flash but not in the request...
            final ExternalContext externalContext=event.getFacesContext().getExternalContext();
            final Map<String, Object> requestMap = externalContext.getRequestMap();
            if(!requestMap.containsKey(ControllerBase.USE_CASE_SCOPE_KEY))
            {
                final Flash flash = externalContext.getFlash();
                if(flash.containsKey(ControllerBase.USE_CASE_SCOPE_KEY))
                {
                    externalContext.getRequestMap().put(ControllerBase.USE_CASE_SCOPE_KEY,externalContext.getFlash().get(ControllerBase.USE_CASE_SCOPE_KEY));
                }
            }
        }
        else if(event.getPhaseId().equals(PhaseId.RENDER_RESPONSE))
        {
            //forward to the same usecase
            final FacesContext facesContext=event.getFacesContext();
            final Map<String, Object> requestMap = facesContext.getExternalContext().getRequestMap();
            final Map<String, Object> viewScope = facesContext.getViewRoot().getViewMap();
            //Response: if the current view does not have the scope key but the request has, new view - forward
            if(!viewScope.containsKey(ControllerBase.USE_CASE_SCOPE_KEY) && 
                requestMap.containsKey(ControllerBase.USE_CASE_SCOPE_KEY))
            {
                //copy the scope key
                viewScope.put(ControllerBase.USE_CASE_SCOPE_KEY,requestMap.get(ControllerBase.USE_CASE_SCOPE_KEY));
            }
        }
    }

    @Override
    public void afterPhase(PhaseEvent event) {
        if(event.getPhaseId().equals(PhaseId.RESTORE_VIEW))
        {
            final FacesContext facesContext=event.getFacesContext();
            final ExternalContext externalContext=facesContext.getExternalContext();
            
            final Map<String, Object> requestMap = externalContext.getRequestMap();
            final Map<String, Object> viewScope = facesContext.getViewRoot().getViewMap();
            if (viewScope.containsKey(ControllerBase.USE_CASE_SCOPE_KEY)) 
            {
                //try to get the value from the viewscope when possible, because in some cases the flash scope fails (many windows/tabs) 
                requestMap.put(ControllerBase.USE_CASE_SCOPE_KEY,viewScope.get(ControllerBase.USE_CASE_SCOPE_KEY));
            }
            else if(requestMap.containsKey(ControllerBase.USE_CASE_SCOPE_KEY))
            {
                //put it in the viewscope too.
                viewScope.put(ControllerBase.USE_CASE_SCOPE_KEY,requestMap.get(ControllerBase.USE_CASE_SCOPE_KEY));
            }
        } 
        else if(event.getPhaseId().equals(PhaseId.RENDER_RESPONSE))
        {
            // keep the useCaseScope alive in the next request
            event.getFacesContext().getExternalContext().getFlash().keep(ControllerBase.USE_CASE_SCOPE_KEY);
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}