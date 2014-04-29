package co.edu.usbcali.presentation.backingBeans;

import co.edu.usbcali.exceptions.*;
import co.edu.usbcali.modelo.*;
import co.edu.usbcali.modelo.dto.PersonasDTO;
import co.edu.usbcali.presentation.businessDelegate.BusinessDelegatorView;
import co.edu.usbcali.utilities.*;

import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;

import org.primefaces.event.DateSelectEvent;
import org.primefaces.event.RowEditEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


/**
 *
 * @author Zathura Code Generator http://code.google.com/p/zathura
 *
 */
public class PersonasView {
    private InputText txtGenero;
    private InputText txtPrimerApellido;
    private InputText txtPrimerNombre;
    private InputText txtProfesion;
    private InputText txtSegundoApellido;
    private InputText txtSegundoNombre;
    private InputText txtIdPersona;
    private Calendar txtFechaNacimiento;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<PersonasDTO> data;
    private PersonasDTO selectedPersonas;

    public PersonasView() {
        super();
    }

    public void rowEventListener(RowEditEvent e) {
        try {
            PersonasDTO personasDTO = (PersonasDTO) e.getObject();

            if (txtGenero == null) {
                txtGenero = new InputText();
            }

            txtGenero.setValue(personasDTO.getGenero());

            if (txtPrimerApellido == null) {
                txtPrimerApellido = new InputText();
            }

            txtPrimerApellido.setValue(personasDTO.getPrimerApellido());

            if (txtPrimerNombre == null) {
                txtPrimerNombre = new InputText();
            }

            txtPrimerNombre.setValue(personasDTO.getPrimerNombre());

            if (txtProfesion == null) {
                txtProfesion = new InputText();
            }

            txtProfesion.setValue(personasDTO.getProfesion());

            if (txtSegundoApellido == null) {
                txtSegundoApellido = new InputText();
            }

            txtSegundoApellido.setValue(personasDTO.getSegundoApellido());

            if (txtSegundoNombre == null) {
                txtSegundoNombre = new InputText();
            }

            txtSegundoNombre.setValue(personasDTO.getSegundoNombre());

            if (txtIdPersona == null) {
                txtIdPersona = new InputText();
            }

            txtIdPersona.setValue(personasDTO.getIdPersona());

            if (txtFechaNacimiento == null) {
                txtFechaNacimiento = new Calendar();
            }

            txtFechaNacimiento.setValue(personasDTO.getFechaNacimiento());

            action_modify();
        } catch (Exception ex) {
        }
    }

    public String action_clear() {
        if (txtGenero != null) {
            txtGenero.setValue(null);
            txtGenero.setDisabled(true);
        }

        if (txtPrimerApellido != null) {
            txtPrimerApellido.setValue(null);
            txtPrimerApellido.setDisabled(true);
        }

        if (txtPrimerNombre != null) {
            txtPrimerNombre.setValue(null);
            txtPrimerNombre.setDisabled(true);
        }

        if (txtProfesion != null) {
            txtProfesion.setValue(null);
            txtProfesion.setDisabled(true);
        }

        if (txtSegundoApellido != null) {
            txtSegundoApellido.setValue(null);
            txtSegundoApellido.setDisabled(true);
        }

        if (txtSegundoNombre != null) {
            txtSegundoNombre.setValue(null);
            txtSegundoNombre.setDisabled(true);
        }

        if (txtFechaNacimiento != null) {
            txtFechaNacimiento.setValue(null);
            txtFechaNacimiento.setDisabled(true);
        }

        if (txtIdPersona != null) {
            txtIdPersona.setValue(null);
            txtIdPersona.setDisabled(false);
        }

        if (btnSave != null) {
            btnSave.setDisabled(true);
        }

        if (btnDelete != null) {
            btnDelete.setDisabled(true);
        }

        if (btnModify != null) {
            btnModify.setDisabled(true);
        }

        if (btnClear != null) {
            btnClear.setDisabled(false);
        }

        return "";
    }

    public void listener_txtFechaNacimiento(DateSelectEvent dse) {
        Date inputDate = (Date) txtFechaNacimiento.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Fecha Seleccionada " +
                dateFormat.format(dse.getDate())));
    }

    public void listener_txtId() {
        Personas entity = null;

        try {
            Long idPersona = new Long(txtIdPersona.getValue().toString());
            entity = BusinessDelegatorView.getPersonas(idPersona);
        } catch (Exception e) {
            // TODO: handle exception
        }

        if (entity == null) {
            txtGenero.setDisabled(false);
            txtPrimerApellido.setDisabled(false);
            txtPrimerNombre.setDisabled(false);
            txtProfesion.setDisabled(false);
            txtSegundoApellido.setDisabled(false);
            txtSegundoNombre.setDisabled(false);
            txtFechaNacimiento.setDisabled(false);
            txtIdPersona.setDisabled(false);
            btnSave.setDisabled(false);
            btnDelete.setDisabled(true);
            btnModify.setDisabled(true);
            btnClear.setDisabled(false);
        } else {
            txtFechaNacimiento.setValue(entity.getFechaNacimiento());
            txtFechaNacimiento.setDisabled(false);
            txtGenero.setValue(entity.getGenero());
            txtGenero.setDisabled(false);
            txtPrimerApellido.setValue(entity.getPrimerApellido());
            txtPrimerApellido.setDisabled(false);
            txtPrimerNombre.setValue(entity.getPrimerNombre());
            txtPrimerNombre.setDisabled(false);
            txtProfesion.setValue(entity.getProfesion());
            txtProfesion.setDisabled(false);
            txtSegundoApellido.setValue(entity.getSegundoApellido());
            txtSegundoApellido.setDisabled(false);
            txtSegundoNombre.setValue(entity.getSegundoNombre());
            txtSegundoNombre.setDisabled(false);
            txtIdPersona.setValue(entity.getIdPersona());
            txtIdPersona.setDisabled(true);
            btnSave.setDisabled(true);
            btnDelete.setDisabled(false);
            btnModify.setDisabled(false);
            btnClear.setDisabled(false);
        }
    }

    public String action_save() {
        try {
            BusinessDelegatorView.savePersonas(FacesUtils.checkDate(
                    txtFechaNacimiento), FacesUtils.checkString(txtGenero),
                FacesUtils.checkLong(txtIdPersona),
                FacesUtils.checkString(txtPrimerApellido),
                FacesUtils.checkString(txtPrimerNombre),
                FacesUtils.checkString(txtProfesion),
                FacesUtils.checkString(txtSegundoApellido),
                FacesUtils.checkString(txtSegundoNombre));
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);
            action_clear();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete() {
        try {
            BusinessDelegatorView.deletePersonas(FacesUtils.checkLong(
                    txtIdPersona));
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
            action_clear();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_modify() {
        try {
            BusinessDelegatorView.updatePersonas(FacesUtils.checkDate(
                    txtFechaNacimiento), FacesUtils.checkString(txtGenero),
                FacesUtils.checkLong(txtIdPersona),
                FacesUtils.checkString(txtPrimerApellido),
                FacesUtils.checkString(txtPrimerNombre),
                FacesUtils.checkString(txtProfesion),
                FacesUtils.checkString(txtSegundoApellido),
                FacesUtils.checkString(txtSegundoNombre));
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
            action_clear();
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String actionDeleteDataTableEditable() {
        try {
            if (txtIdPersona == null) {
                txtIdPersona = new InputText();
            }

            txtIdPersona.setValue(selectedPersonas.getIdPersona());

            BusinessDelegatorView.deletePersonas(FacesUtils.checkLong(
                    txtIdPersona));
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
            action_clear();
            data.remove(selectedPersonas);
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_modifyWitDTO(Date fechaNacimiento, String genero,
        Long idPersona, String primerApellido, String primerNombre,
        String profesion, String segundoApellido, String segundoNombre)
        throws Exception {
        try {
            BusinessDelegatorView.updatePersonas(fechaNacimiento, genero,
                idPersona, primerApellido, primerNombre, profesion,
                segundoApellido, segundoNombre);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("PersonasView").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtGenero() {
        return txtGenero;
    }

    public void setTxtGenero(InputText txtGenero) {
        this.txtGenero = txtGenero;
    }

    public InputText getTxtPrimerApellido() {
        return txtPrimerApellido;
    }

    public void setTxtPrimerApellido(InputText txtPrimerApellido) {
        this.txtPrimerApellido = txtPrimerApellido;
    }

    public InputText getTxtPrimerNombre() {
        return txtPrimerNombre;
    }

    public void setTxtPrimerNombre(InputText txtPrimerNombre) {
        this.txtPrimerNombre = txtPrimerNombre;
    }

    public InputText getTxtProfesion() {
        return txtProfesion;
    }

    public void setTxtProfesion(InputText txtProfesion) {
        this.txtProfesion = txtProfesion;
    }

    public InputText getTxtSegundoApellido() {
        return txtSegundoApellido;
    }

    public void setTxtSegundoApellido(InputText txtSegundoApellido) {
        this.txtSegundoApellido = txtSegundoApellido;
    }

    public InputText getTxtSegundoNombre() {
        return txtSegundoNombre;
    }

    public void setTxtSegundoNombre(InputText txtSegundoNombre) {
        this.txtSegundoNombre = txtSegundoNombre;
    }

    public Calendar getTxtFechaNacimiento() {
        return txtFechaNacimiento;
    }

    public void setTxtFechaNacimiento(Calendar txtFechaNacimiento) {
        this.txtFechaNacimiento = txtFechaNacimiento;
    }

    public InputText getTxtIdPersona() {
        return txtIdPersona;
    }

    public void setTxtIdPersona(InputText txtIdPersona) {
        this.txtIdPersona = txtIdPersona;
    }

    public List<PersonasDTO> getData() {
        try {
            if (data == null) {
                data = BusinessDelegatorView.getDataPersonas();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<PersonasDTO> personasDTO) {
        this.data = personasDTO;
    }

    public PersonasDTO getSelectedPersonas() {
        return selectedPersonas;
    }

    public void setSelectedPersonas(PersonasDTO personas) {
        this.selectedPersonas = personas;
    }

    public CommandButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(CommandButton btnSave) {
        this.btnSave = btnSave;
    }

    public CommandButton getBtnModify() {
        return btnModify;
    }

    public void setBtnModify(CommandButton btnModify) {
        this.btnModify = btnModify;
    }

    public CommandButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(CommandButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public CommandButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(CommandButton btnClear) {
        this.btnClear = btnClear;
    }

    public TimeZone getTimeZone() {
        return java.util.TimeZone.getDefault();
    }
}
