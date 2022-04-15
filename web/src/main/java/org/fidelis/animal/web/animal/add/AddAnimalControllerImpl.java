// license-header java merge-point
// Generated by andromda-jsf cartridge (controllers\ControllerImpl.java.vsl)
package org.fidelis.animal.web.animal.add;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.fidelis.animal.ServiceLocator;
import org.fidelis.animal.model.animal.AnimalType;
import org.fidelis.animal.model.animal.AnimalBreed;

/**
 * @see org.fidelis.animal.web.animal.add.AddAnimalController
 */
public class AddAnimalControllerImpl
        extends AddAnimalController {

    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 6939299498062360276L;

    /**
     * @see
     * org.fidelis.animal.web.animal.add.AddAnimalController#loadOptions(java.lang.String
     * type, java.lang.Long numberOfAnimals, java.util.Date dateOfBirth)
     */
    @Override
    public void loadOptions(LoadOptionsForm form) throws Throwable {
        try {
            final Collection typeBackingList = new ArrayList<SelectItem>();
            typeBackingList.addAll(AnimalType.literals());
            form.setTypeBackingList(typeBackingList);
            
            final Collection breedBackingList = new ArrayList<SelectItem>();
            breedBackingList.addAll(AnimalBreed.literals());
            form.setBreedBackingList(breedBackingList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @see
     * org.fidelis.animal.web.animal.add.AddAnimalController#add(java.lang.String
     * type, java.util.Date dateOfBirth, java.lang.Long numberOfAnimals,
     * java.lang.Long id)
     */
    @Override
    public void add(AddForm form) throws Throwable {
        try {
            Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

            Long feed = null;
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (entry.getKey().contains("feed_hinput")) {
                    try {
                        feed = Long.parseLong(entry.getValue());
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }

                }
            }

            int numberOfAnimals = 1;
            if (form.getNumberOfAnimals() != null && form.getNumberOfAnimals() != 0) {
                numberOfAnimals = form.getNumberOfAnimals().intValue();
            }

            for (int i = 0; i < numberOfAnimals; i++) {
                ServiceLocator.instance().getAnimalService().add(form.getType(),
                        form.getDateOfBirth(), feed,form.getBreed());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
