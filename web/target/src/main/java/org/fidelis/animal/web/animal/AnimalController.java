// license-header java merge-point
// Generated by andromda-jsf cartridge (controllers\Controller.java.vsl) DO NOT EDIT!
package org.fidelis.animal.web.animal;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.fidelis.animal.ControllerBase;
import org.fidelis.animal.JsfUtils;
import org.fidelis.animal.web.animal.add.AddAnimalController;
import org.fidelis.animal.web.document.add.AddDocumentController;

/**
 * TODO: Model Documentation for AnimalController
 */
public abstract class AnimalController
    extends ControllerBase
    implements Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Returns an instance from the JSF context
     *
     */
    public static AnimalController instance()
    {
        return (AnimalController)JsfUtils.resolveVariable("animalController");
    }
    
    /**
     * Populate action form and page variables
     *
     * @param currentView the current view
     * @param forward the forward view
     * @param sourceForm the source form
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    private void populateActionFormsAndPageVariables(final String currentView, String forward, final Object sourceForm) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        if(forward == null)
        {
            forward=currentView;
        }
        
        final Map<String,Object> pageVariables=this.getPageVariables(forward);
        if("/org/fidelis/animal/web/animal/animals.jsf".equals(forward))
        {
            ManageAnimalsViewPopulator.populateForm(sourceForm,this.getAnimalsSearchForm());
            ManageAnimalsViewPopulator.populateForm(sourceForm,this.getAnimalsDetailsForm());
            ManageAnimalsViewPopulator.populateAnimalsPageVariables(sourceForm,pageVariables);
        }
        else
        if("/org/fidelis/animal/web/animal/animal.jsf".equals(forward))
        {
            ManageAnimalsViewPopulator.populateForm(sourceForm,this.getAnimalSaveForm());
            ManageAnimalsViewPopulator.populateForm(sourceForm,this.getAnimalAttachForm());
            ManageAnimalsViewPopulator.populateAnimalPageVariables(sourceForm,pageVariables);
        }
        ControllerBase.getUseCaseScope().put(CURRENT_PAGE_VARIABLES_KEY, pageVariables);
    }
    
    /**
     * TODO: Model Documentation for AnimalController.search
     *
     * @param form the associated form
     * @throws Throwable
     */
    public abstract void search(SearchForm form)
        throws Throwable;

    /**
     * TODO: Model Documentation for AnimalController.load
     *
     * @param form the associated form
     * @throws Throwable
     */
    public abstract void load(LoadForm form)
        throws Throwable;

    /**
     * TODO: Model Documentation for AnimalController.edit
     *
     * @param form the associated form
     * @throws Throwable
     */
    public abstract void edit(EditForm form)
        throws Throwable;

    /**
     * TODO: Model Documentation for AnimalController.checkId
     *
     * @param form the associated form
     * @throws Throwable
     */
    public abstract Boolean checkId(CheckIdForm form)
        throws Throwable;


    /**
     * Retrieves the {@link AnimalsSearchFormImpl} form instance 
     *
     * @return AnimalsSearchFormImpl
     */
    protected AnimalsSearchFormImpl getAnimalsSearchForm()
    {
        return (AnimalsSearchFormImpl)JsfUtils.resolveVariable("manageAnimalsAnimalsSearchForm");
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.Search
     * This method is called when 'Search' is triggered in the view 'Animals'.
     * It can be safely overridden in descendant classes.
     *
     * @param form the associated form
     */
    protected void _animals_search(AnimalsSearchFormImpl form)
    {
        //this method can be overridden
    }

    /**
     * Retrieves animalsSearch()
     *    
     * @return animalsSearch
     * @throws Throwable
     */
    public String animalsSearch()
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsAnimalsSearchForm");
        
        String forward=null;
        final AnimalsSearchFormImpl form =
            this.getAnimalsSearchForm();
            
        //trigger method execution
        _animals_search(form);

        forward = _search(form);
        populateActionFormsAndPageVariables("/org/fidelis/animal/web/animal/animals.jsf",forward,form);
        if(forward != null)
        {
            if("/org/fidelis/animal/web/animal/animals.jsf".equals(forward))
            {
                forward = null; //the destination form is the same, stay on the current view
            }
        }
        
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.search
     *
     * @param form the associated form
     * @return the forward view
     * @throws Throwable
     */
    protected String _search(final AnimalsSearchFormImpl form)
        throws Throwable
    {
        String forward = null;
    
        search(form);
        forward = "/org/fidelis/animal/web/animal/animals.jsf";
        return forward;
    }

    /**
     * Retrieves the {@link AnimalsDetailsFormImpl} form instance 
     *
     * @return AnimalsDetailsFormImpl
     */
    protected AnimalsDetailsFormImpl getAnimalsDetailsForm()
    {
        return (AnimalsDetailsFormImpl)JsfUtils.resolveVariable("manageAnimalsAnimalsDetailsForm");
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.Details
     * This method is called when 'Details' is triggered in the view 'Animals'.
     * It can be safely overridden in descendant classes.
     *
     * @param form the associated form
     */
    protected void _animals_details(AnimalsDetailsFormImpl form)
    {
        //this method can be overridden
    }

    /**
     * Retrieves animalsDetails()
     *    
     * @return animalsDetails
     * @throws Throwable
     */
    public String animalsDetails()
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsAnimalsDetailsForm");
        
        String forward=null;
        final AnimalsDetailsFormImpl form =
            this.getAnimalsDetailsForm();
            
        //trigger method execution
        _animals_details(form);

        forward = _load(form);
        populateActionFormsAndPageVariables("/org/fidelis/animal/web/animal/animals.jsf",forward,form);
        if(forward != null)
        {
            if("/org/fidelis/animal/web/animal/animals.jsf".equals(forward))
            {
                forward = null; //the destination form is the same, stay on the current view
            }
        }
        
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.load
     *
     * @param form the associated form
     * @return the forward view
     * @throws Throwable
     */
    protected String _load(final AnimalsDetailsFormImpl form)
        throws Throwable
    {
        String forward = null;
    
        load(form);
        forward = "/org/fidelis/animal/web/animal/animal.jsf";
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.Add Animal
     * This method is called when 'Add Animal' is triggered in the view 'Animals'.
     * It can be safely overridden in descendant classes.
     */
    protected void _animals_addAnimal()
    {
        //this method can be overridden
    }

    /**
     * Retrieves animalsAddAnimal()
     *    
     * @return animalsAddAnimal
     * @throws Throwable
     */
    public String animalsAddAnimal()
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsAnimalsAddAnimalForm");
        
        String forward=null;
        forward=((AddAnimalController)JsfUtils.resolveVariable("addAnimalController")).startUseCase();
        
        return forward;
    }

    /**
     * Retrieves the {@link AnimalSaveFormImpl} form instance 
     *
     * @return AnimalSaveFormImpl
     */
    protected AnimalSaveFormImpl getAnimalSaveForm()
    {
        return (AnimalSaveFormImpl)JsfUtils.resolveVariable("manageAnimalsAnimalSaveForm");
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.Save
     * This method is called when 'Save' is triggered in the view 'Animal'.
     * It can be safely overridden in descendant classes.
     *
     * @param form the associated form
     */
    protected void _animal_save(AnimalSaveFormImpl form)
    {
        //this method can be overridden
    }

    /**
     * Retrieves animalSave()
     *    
     * @return animalSave
     * @throws Throwable
     */
    public String animalSave()
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsAnimalSaveForm");
        
        String forward=null;
        final AnimalSaveFormImpl form =
            this.getAnimalSaveForm();
            
        //trigger method execution
        _animal_save(form);

        forward = _edit(form);
        populateActionFormsAndPageVariables("/org/fidelis/animal/web/animal/animal.jsf",forward,form);
        if(forward != null)
        {
            if("/org/fidelis/animal/web/animal/animal.jsf".equals(forward))
            {
                forward = null; //the destination form is the same, stay on the current view
            }
        }
        
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.edit
     *
     * @param form the associated form
     * @return the forward view
     * @throws Throwable
     */
    protected String _edit(final AnimalSaveFormImpl form)
        throws Throwable
    {
        String forward = null;
    
        edit(form);
        forward = _load(form);
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.load
     *
     * @param form the associated form
     * @return the forward view
     * @throws Throwable
     */
    protected String _load(final AnimalSaveFormImpl form)
        throws Throwable
    {
        String forward = null;
    
        load(form);
        forward = "/org/fidelis/animal/web/animal/animal.jsf";
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.List
     * This method is called when 'List' is triggered in the view 'Animal'.
     * It can be safely overridden in descendant classes.
     */
    protected void _animal_list()
    {
        //this method can be overridden
    }

    /**
     * Retrieves animalList()
     *    
     * @return animalList
     * @throws Throwable
     */
    public String animalList()
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsAnimalListForm");
        
        String forward=null;
        forward=((AnimalController)JsfUtils.resolveVariable("animalController")).startUseCase();
        
        return forward;
    }

    /**
     * Retrieves the {@link AnimalAttachFormImpl} form instance 
     *
     * @return AnimalAttachFormImpl
     */
    protected AnimalAttachFormImpl getAnimalAttachForm()
    {
        return (AnimalAttachFormImpl)JsfUtils.resolveVariable("manageAnimalsAnimalAttachForm");
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.Attach
     * This method is called when 'Attach' is triggered in the view 'Animal'.
     * It can be safely overridden in descendant classes.
     *
     * @param form the associated form
     */
    protected void _animal_attach(AnimalAttachFormImpl form)
    {
        //this method can be overridden
    }

    /**
     * Retrieves animalAttach()
     *    
     * @return animalAttach
     * @throws Throwable
     */
    public String animalAttach()
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsAnimalAttachForm");
        
        String forward=null;
        this.getAnimalAttachForm().copyTo(getUseCaseParameters());
    
        forward=((AddDocumentController)JsfUtils.resolveVariable("addDocumentController")).startUseCase();
        
        return forward;
    }

    /**
     * Retrieves the {@link ManageAnimalsFormImpl} form instance 
     *
     * @return ManageAnimalsFormImpl
     */
    protected ManageAnimalsFormImpl getManageAnimalsForm()
    {
        return (ManageAnimalsFormImpl)JsfUtils.resolveVariable("manageAnimalsManageAnimalsForm");
    }

    /**
     * This method is called when the use case 'Manage Animals' starts.
     * It can be safely overridden in descendant classes.
     *
     * @param form the associated form
     */
    protected void _manageAnimals_started(ManageAnimalsFormImpl form)
    {
        //this method can be overridden
    }

    /**
     * Retrieves the internal start use case
     *    
     * @return manageAnimals
     * @throws Throwable
     */
    protected String internalStartUseCase(Map<String,Object> useCaseParameters)
        throws Throwable
    {
        this.setLastPostedFormClientId("manageAnimalsManageAnimalsForm");
        
        String forward=null;
        final ManageAnimalsFormImpl form =
            this.getManageAnimalsForm();
            
        //copy parameters form caller use case
        form.copyFrom(useCaseParameters);
        
        //trigger method execution
        _manageAnimals_started(form);

        forward = __checkId(form);
        populateActionFormsAndPageVariables(null,forward,form);
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.search
     *
     * @param form the associated form
     * @return the forward view
     * @throws Throwable
     */
    protected String _search(final ManageAnimalsFormImpl form)
        throws Throwable
    {
        String forward = null;
    
        search(form);
        forward = "/org/fidelis/animal/web/animal/animals.jsf";
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.load
     *
     * @param form the associated form
     * @return the forward view
     * @throws Throwable
     */
    protected String _load(final ManageAnimalsFormImpl form)
        throws Throwable
    {
        String forward = null;
    
        load(form);
        forward = "/org/fidelis/animal/web/animal/animal.jsf";
        return forward;
    }

    /**
     * TODO: Model Documentation for org.fidelis.animal.web.animal.unknown
     *
     * @return a transition
     */
    protected String __checkId(final ManageAnimalsFormImpl form)
        throws Throwable
    {
        final String value = String.valueOf(checkId(form));
        String forward = null;
        if (value.equals("false"))
        {
            forward = _search(form);
        }
        if (value.equals("true"))
        {
            forward = _load(form);
        }
        if (forward == null)
        {
            // throw exception in case we have an invalid return value from the controller
            throw new RuntimeException("Runtime model error: no valid path selected. Selected path="+value);
        }
        else
        {
            return forward;
        }
    }


}